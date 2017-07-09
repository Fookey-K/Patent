package com.web.dao;


import com.web.entity.SysUser;

/**
 * Created by 孔慧真 on 2017/6/30.
 */
public interface SysUserDao {

    SysUser selectLoginUser(String userId);

}
