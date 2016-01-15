package com.jdk2010.member.member.service.impl;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
 
import com.jdk2010.member.member.service.IMemberService;
import com.jdk2010.base.service.BaseServiceImpl;
import com.jdk2010.framework.dal.client.DalClient;
import com.jdk2010.framework.util.DbKit;

@Service("memberService")
public class MemberServiceImpl extends BaseServiceImpl implements IMemberService{
  	@Resource
    DalClient dalClient;
  	
  	
  	 @Override
     public boolean isExistUsername(String username) {
         String sql = "select * from member where nickname='" + username
                 + "'";
         List<Map<String, Object>> roleList = dalClient.queryForObjectList(sql);
         if (roleList.size() > 0) {
             return true;
         } else {
             return false;
         }

     }
}
