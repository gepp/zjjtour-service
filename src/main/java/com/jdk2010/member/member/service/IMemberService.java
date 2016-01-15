package com.jdk2010.member.member.service; 
import com.jdk2010.base.service.IBaseService;
public interface IMemberService  extends IBaseService{
    public boolean isExistUsername(String code);
}
