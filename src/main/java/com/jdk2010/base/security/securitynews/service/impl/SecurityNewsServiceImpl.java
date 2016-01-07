package com.jdk2010.base.security.securitynews.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
 
import com.jdk2010.base.security.securitynews.model.SecurityNews;
import com.jdk2010.base.security.securitynews.service.ISecurityNewsService;
import com.jdk2010.base.service.BaseServiceImpl;
import com.jdk2010.framework.dal.client.DalClient;
import com.jdk2010.framework.util.DbKit;

@Service("securityNewsService")
public class SecurityNewsServiceImpl extends BaseServiceImpl implements ISecurityNewsService{
  	@Resource
    DalClient dalClient;
  	
  	public List<SecurityNews> getTop7News() {
        return dalClient.queryForObjectList("select id,title,ctime from security_news order by ctime desc limit 0,7",SecurityNews.class);
    }
}
