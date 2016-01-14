package com.jdk2010.member.membercomplain.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
 
import com.jdk2010.member.membercomplain.service.IMemberComplainService;
import com.jdk2010.base.service.BaseServiceImpl;
import com.jdk2010.framework.dal.client.DalClient;
import com.jdk2010.framework.util.DbKit;

@Service("memberComplainService")
public class MemberComplainServiceImpl extends BaseServiceImpl implements IMemberComplainService{
  	@Resource
    DalClient dalClient;
}
