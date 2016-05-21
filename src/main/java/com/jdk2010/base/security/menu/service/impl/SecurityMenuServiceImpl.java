package com.jdk2010.base.security.menu.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jdk2010.base.security.menu.model.SecurityMenu;
import com.jdk2010.base.security.menu.service.ISecurityMenuService;
import com.jdk2010.base.service.BaseServiceImpl;
import com.jdk2010.framework.dal.client.DalClient;
import com.jdk2010.framework.util.DbKit;

@Service("securityMenuService")
public class SecurityMenuServiceImpl extends BaseServiceImpl implements ISecurityMenuService {

    @Resource
    DalClient dalClient;

    @Override
    public List<Map<String, Object>> getMenuByParentId(String pid)  {
        DbKit dbKit = new DbKit("select * from security_menu  where parent_id='" + pid + "' and type in (0,1,3) and column_type!=3   order by orderlist asc");
        List<Map<String, Object>> categoryList = dalClient.queryForObjectList(dbKit);
        return categoryList;
    }
    
    @Override
    public List<Map<String, Object>> getMenuByParentIdColumn(String pid,String type)  {
        DbKit dbKit = new DbKit("select * from security_menu  where parent_id='" + pid + "' and type='"+type+"' order by banner_id asc, orderlist asc");
        List<Map<String, Object>> categoryList = dalClient.queryForObjectList(dbKit);
        return categoryList;
    }
    
    
    @Override
    public List<Map<String, Object>> getMenuListByParentIdColumn(String pid,String type)  {
        List returnList = new ArrayList<Map<String, Object>>();
        List menuList = getMenuByParentIdColumn(pid,type);
        for (int i = 0; i < menuList.size(); i++) {
            Map map = (HashMap<String, Object>) menuList.get(i);
            returnList.add(map);
            int k = 0;
            String leftStr = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
            for (int m = 0; m < k; m++) {
                leftStr = leftStr + leftStr;
            }
            // String span="<span style=\"margin-left:"+leftStr+"px;\"></span>";
            if (getMenuListByParentIdColumn(map.get("id") + "",type).size() > 0) {
                k = k + 1;
                List returnListChild = getMenuByParentIdColumn(map.get("id") + "",type);
                for (int j = 0; j < returnListChild.size(); j++) {
                    Map childmap = (HashMap) returnListChild.get(j);
                    childmap.put("name", leftStr + childmap.get("name"));
                    childmap.put("orderlist", childmap.get("orderlist"));
                    returnList.add(childmap);
                }
            }
        }
        return returnList;
    }
    
    
    @Override
    public List<Map<String, Object>> getMenuListByParentId(String pid)  {
        List returnList = new ArrayList<Map<String, Object>>();
        List menuList = getMenuByParentId(pid);
        for (int i = 0; i < menuList.size(); i++) {
            Map map = (HashMap<String, Object>) menuList.get(i);
            returnList.add(map);
            int k = 0;
            String leftStr = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
            for (int m = 0; m < k; m++) {
                leftStr = leftStr + leftStr;
            }
            // String span="<span style=\"margin-left:"+leftStr+"px;\"></span>";
            if (getMenuByParentId(map.get("id") + "").size() > 0) {
                k = k + 1;
                List returnListChild = getMenuListByParentId(map.get("id") + "");
                for (int j = 0; j < returnListChild.size(); j++) {
                    Map childmap = (HashMap) returnListChild.get(j);
                    childmap.put("name", leftStr + childmap.get("name"));
                    childmap.put("orderlist", childmap.get("orderlist"));
                    returnList.add(childmap);
                }
            }
        }
        return returnList;
    }

	@Override
	public Map<String, List<Map<String, Object>>> getBqList() {
		Map<String, List<Map<String, Object>>> linkedMenuNameList = new LinkedHashMap<String, List<Map<String, Object>>>();
		List<Map<String, Object>> menuList = getMenuListByParentIdColumn("0", "2");

		HashMap<String, Object> linkedMenuList = new LinkedHashMap<String, Object>();
		for (Map<String, Object> child : menuList) {
			if (child.get("banner_id") != null) {
				linkedMenuList.put(child.get("banner_id") + "", null);
			}
		}

		

		for (String key : linkedMenuList.keySet()) {
			List<Map<String, Object>> childList = new ArrayList<Map<String, Object>>();
			for (Map<String, Object> child : menuList) {
				if (child.get("banner_id") != null) {
					if ((child.get("banner_id")+"").equals(key)) {
						childList.add(child);
					}
				}
			}
			SecurityMenu menu = findById(key,
					SecurityMenu.class);
			if (menu != null) {
				linkedMenuNameList.put(menu.getName(), childList);
			}
		}
		return linkedMenuNameList;
	}

 
}
