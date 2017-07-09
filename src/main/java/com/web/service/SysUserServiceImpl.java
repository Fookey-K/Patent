package com.web.service;

import com.web.dao.SysUserDao;
import com.web.entity.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 孔慧真 on 2017/6/30.
 */
@Service
public class SysUserServiceImpl implements SysUserService{


    @Resource
    SysUserDao sysUserDao;

    public SysUser selectLoginUser(String userId) {;
        SysUser sysUser = sysUserDao.selectLoginUser(userId);;
        return sysUser;
    }
}
