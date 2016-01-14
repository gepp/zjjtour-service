package com.jdk2010.member.memberactivity.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
 
import com.jdk2010.member.memberactivity.service.IMemberActivityService;
import com.jdk2010.base.service.BaseServiceImpl;
import com.jdk2010.framework.dal.client.DalClient;
import com.jdk2010.framework.util.DbKit;

@Service("memberActivityService")
public class MemberActivityServiceImpl extends BaseServiceImpl implements IMemberActivityService{
  	@Resource
    DalClient dalClient;
}
