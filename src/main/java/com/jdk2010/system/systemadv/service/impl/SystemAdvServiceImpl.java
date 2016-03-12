package com.jdk2010.system.systemadv.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
 
import com.jdk2010.system.systemadv.service.ISystemAdvService;
import com.jdk2010.base.service.BaseServiceImpl;
import com.jdk2010.framework.dal.client.DalClient;
import com.jdk2010.framework.util.DbKit;

@Service("systemAdvService")
public class SystemAdvServiceImpl extends BaseServiceImpl implements ISystemAdvService{
  	@Resource
    DalClient dalClient;
}
