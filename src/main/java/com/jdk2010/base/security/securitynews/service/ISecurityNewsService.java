package com.jdk2010.base.security.securitynews.service; 
import java.util.List;

import com.jdk2010.base.security.securitynews.model.SecurityNews;
import com.jdk2010.base.service.IBaseService;
public interface ISecurityNewsService  extends IBaseService{
    public List<SecurityNews> getTop7News();
}
