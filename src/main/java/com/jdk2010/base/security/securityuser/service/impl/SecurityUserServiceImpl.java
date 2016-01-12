package com.jdk2010.base.security.securityuser.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.jdk2010.base.security.menu.model.SecurityMenu;
import com.jdk2010.base.security.menu.service.ISecurityMenuService;
import com.jdk2010.base.security.securityrole.model.SecurityRole;
import com.jdk2010.base.security.securityrole.service.ISecurityRoleService;
import com.jdk2010.base.security.securityrole.service.impl.SecurityRoleServiceImpl;
import com.jdk2010.base.security.securityrolemenu.model.SecurityRoleMenu;
import com.jdk2010.base.security.securityrolemenu.service.ISecurityRoleMenuService;
import com.jdk2010.base.security.securityuser.model.SecurityUser;
import com.jdk2010.base.security.securityuser.service.ISecurityUserService;
import com.jdk2010.base.security.securityuserrole.model.SecurityUserRole;
import com.jdk2010.base.security.securityuserrole.service.ISecurityUserRoleService;
import com.jdk2010.base.service.BaseServiceImpl;
import com.jdk2010.base.tools.RequestUtil;
import com.jdk2010.framework.dal.client.DalClient;
import com.jdk2010.framework.util.DbKit;

@Service("securityUserService")
public class SecurityUserServiceImpl extends BaseServiceImpl implements
ISecurityUserService {
	@Resource
	DalClient dalClient;

	@Resource
	ISecurityUserRoleService securityUserRoleService;

	@Resource
	ISecurityMenuService securityMenuService;

	@Resource
	ISecurityRoleMenuService securityRoleMenuService;

	@Resource
	ISecurityRoleService securityRoleService;

	@Override
	public SecurityUser login(String username, String password)
			throws Exception {
		DbKit dbKit = new DbKit(
				"select * from security_user where username=:username and userpwd=:password");
		dbKit.put("username", username);
		dbKit.put("password", password);
		SecurityUser user = dalClient.queryForObject(dbKit, SecurityUser.class);
		if (user == null) {
			return null;
		} else {
			return user;
		}

	}

	@Override
	public boolean isExistUsername(String username) {
		String sql = "select * from security_user where username='" + username
				+ "'";
		List<Map<String, Object>> roleList = dalClient.queryForObjectList(sql);
		if (roleList.size() > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public Map<Object, Object> getUserMenuByUserId(Integer userId) {
		// 组装菜单
		Map<Object, Object> returnMenuMap = new LinkedHashMap<Object, Object>();
		List<SecurityUserRole> userRoleList = securityUserRoleService
				.getSecurityUserRoleByUserId(userId);
		List<Map<String, Object>> firstMenuList = securityMenuService
				.getMenuByParentId("0");
		Map<String, Object> userMenuMap = new HashMap<String, Object>();
		String fabuFlag = "0";
		String shenheFlag = "0";

		for (SecurityUserRole userRole : userRoleList) {
			List<SecurityRoleMenu> roleMenuList = securityRoleMenuService
					.getSecurityRoleMenuByRoleId(userRole.getRoleId());
			for (SecurityRoleMenu roleMenu : roleMenuList) {
				SecurityMenu menu = securityMenuService.findById(
						roleMenu.getMenuId(), SecurityMenu.class);
				SecurityRole role = securityRoleService.findById(
						roleMenu.getRoleId(), SecurityRole.class);

				if(role!=null){
					if(menu!=null){
						if ("1".equals(menu.getType())) {
							if (role.getType().equals("1")) {
								shenheFlag = "1";
							}
							if (role.getType().equals("2")) {
								fabuFlag = "1";
							}
						}
					}
				}

				userMenuMap
				.put(roleMenu.getMenuId() + "", roleMenu.getMenuId());
			}
		}

		Iterator<Map<String, Object>> iterator = firstMenuList.iterator();
		while (iterator.hasNext()) {
			Map<String, Object> firstMenu = iterator.next();
			String firstId = firstMenu.get("id") + "";
			if (userMenuMap.containsKey(firstId)) {
				List<Map<String, Object>> keyValue = new ArrayList<Map<String, Object>>();
				List<Map<String, Object>> secondMenuList = securityMenuService
						.getMenuByParentId(firstId + "");
				for (Map<String, Object> secondMenu : secondMenuList) {
					String secondId = secondMenu.get("id") + "";
					if (userMenuMap.containsKey(secondId)) {
						keyValue.add(secondMenu);
					}
				}
				userMenuMap.remove(firstId);
				returnMenuMap.put(firstMenu, keyValue);

			}
		}
		returnMenuMap.put("fabuFlag", fabuFlag);
		returnMenuMap.put("shenheFlag", shenheFlag);
		return returnMenuMap;
	}

	@Override
	public Map<Object, Object> getAllMenu() {
		// 组装菜单
		Map<Object, Object> returnMenuMap = new LinkedHashMap<Object, Object>();
		List<Map<String, Object>> firstMenuList = securityMenuService
				.getMenuByParentId("0");

		Iterator<Map<String, Object>> iterator = firstMenuList.iterator();
		while (iterator.hasNext()) {
			Map<String, Object> firstMenu = iterator.next();
			String firstId = firstMenu.get("id") + "";
			List<Map<String, Object>> keyValue = new ArrayList<Map<String, Object>>();
			List<Map<String, Object>> secondMenuList = securityMenuService
					.getMenuByParentId(firstId + "");
			for (Map<String, Object> secondMenu : secondMenuList) {
				String secondId = secondMenu.get("id") + "";
				keyValue.add(secondMenu);
			}
			returnMenuMap.put(firstMenu, keyValue);
		}
		returnMenuMap.put("fabuFlag", "1");
		returnMenuMap.put("shenheFlag", "1");
		return returnMenuMap;
	}

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext(
				"conf/spring/spring-dal.xml");
		ISecurityUserService securityUserService = factory
				.getBean(ISecurityUserService.class);
		Map<Object, Object> userMenuMap = securityUserService.getAllMenu();
		for (Object key : userMenuMap.keySet()) {
			System.out.println("key:" + key);
			List<Map<String, Object>> keyValue = (List<Map<String, Object>>) userMenuMap
					.get(key);
			for (Map<String, Object> map : keyValue) {
				System.out.println(map.get("name"));
			}
		}
	}

	@Override
	public Map<Object, Object> getUserMenu(SecurityUser user) {
		if (user.getUsername().equals("system")) {
			return getAllMenu();
		} else {
			return getUserMenuByUserId(user.getId());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public String getUserMenuStr(SecurityUser user) {
		String menuStr = "";
		String contextpath = RequestUtil.getRequest().getContextPath();
		Map<Object, Object> userMenuMap = getUserMenu(user);
		for (Object obj : userMenuMap.keySet()) {
			if (obj instanceof java.lang.String) {
				continue;
			}
			Map<String, Object> parentMap = (Map<String, Object>) obj;
			menuStr = menuStr + "<dd><div class=\"title\"><span><img src=\""
					+ contextpath + parentMap.get("img") + "\" /></span>"
					+ parentMap.get("name") + "</div><ul class=\"menuson\">";
			List<Map<String, Object>> list = (List<Map<String, Object>>) userMenuMap
					.get(obj);
			for (int i = 0; i < list.size(); i++) {
				Map<String, Object> secondMap = (Map<String, Object>) list
						.get(i);
				Integer type = (Integer) secondMap.get("type");

				if (type == 0) {
					menuStr = menuStr + "<li><cite></cite><a href=\""
							+ contextpath + "" + secondMap.get("url")
							+ "\" target=\"rightFrame\">"
							+ secondMap.get("name") + "</a><i></i></li>";
				} else if (type == 1) {
					String column_type = (String) secondMap.get("column_type");
					if (column_type.equals("1")) {
						menuStr = menuStr + "<li><cite></cite><a href=\""
								+ contextpath + "/securitynews/list.htm?id="
								+ secondMap.get("id")
								+ "\" target=\"rightFrame\">"
								+ secondMap.get("name") + "</a><i></i></li>";

					} else if (column_type.equals("2")) {
						menuStr = menuStr + "<li><cite></cite><a href=\""
								+ contextpath
								+ "/securitynews/modifyDetail.htm?menuId="
								+ secondMap.get("id")
								+ "\" target=\"rightFrame\">"
								+ secondMap.get("name") + "</a><i></i></li>";
					} else {
						menuStr = menuStr + "<li><cite></cite>"
								+ secondMap.get("name") + "<i></i></li>";

					}

				} else {
					menuStr = menuStr + "<li><cite></cite><a href=\""
							+ contextpath + "" + secondMap.get("url")
							+ "\" target=\"rightFrame\">"
							+ secondMap.get("name") + "</a><i></i></li>";
				}
			}
			menuStr = menuStr + "</ul></dd>";
		}
		return menuStr;
	}

}
