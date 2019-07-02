package com.zz.ikeeping.service.login.dao;

import com.zz.ikeeping.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    //根据手机查询用户
    @Select("select * from t_user where flag=1 and phone=#{phone}")
    User selectByPhone(String phone);


}
