package com.jdk2010.system.systemwaitdo.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
 
import com.jdk2010.system.systemwaitdo.service.ISystemWaitdoService;
import com.jdk2010.base.service.BaseServiceImpl;
import com.jdk2010.framework.dal.client.DalClient;
import com.jdk2010.framework.util.DbKit;

@Service("systemWaitdoService")
public class SystemWaitdoServiceImpl extends BaseServiceImpl implements ISystemWaitdoService{
  	@Resource
    DalClient dalClient;
}
