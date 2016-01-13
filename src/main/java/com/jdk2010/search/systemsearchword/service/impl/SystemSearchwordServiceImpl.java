package com.jdk2010.search.systemsearchword.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
 
import com.jdk2010.search.systemsearchword.service.ISystemSearchwordService;
import com.jdk2010.base.service.BaseServiceImpl;
import com.jdk2010.framework.dal.client.DalClient;
import com.jdk2010.framework.util.DbKit;

@Service("systemSearchwordService")
public class SystemSearchwordServiceImpl extends BaseServiceImpl implements ISystemSearchwordService{
  	@Resource
    DalClient dalClient;
}
