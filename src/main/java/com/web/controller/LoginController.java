package com.web.controller;
import com.web.entity.SysUser;
import com.web.service.SysUserService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 孔慧真 on 2017/6/29.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired  //按类型注入 Resource是按照名称注入
    SysUserService sysUserService;

    @RequestMapping("init.do")
    public String login(){
        System.out.println("进入");
        return "login";
    }

    @RequestMapping("userLogin.do")
    public String userLogin(HttpServletRequest request, HttpSession session){
        //读取用户（根据用户名读取信息）
        String userId = request.getParameter("userName");
        String password = request.getParameter("password");

        //刷新页面时重新从application中获取信息
        ServletContext application = session.getServletContext();
        if (null != application.getAttribute("userInfo")) {
            SysUser userTemp =  (SysUser) application.getAttribute("userInfo");
            userId = userTemp.getUserId();
            password = userTemp.getPassword();
        }
        SysUser sysUser = sysUserService.selectLoginUser(userId);

        //check（check是否存在）
        String rtnStr;
        if(sysUser == null){
            rtnStr = "login";
        }else {
            //check通过，用户信息放到session中去，全程跟着
            if(password.equals(sysUser.getPassword())){
                application.setAttribute("userInfo",sysUser);
                rtnStr = "forward:/main/init.do";
            }else {
                rtnStr = "login";
            }
        }
        return rtnStr;
    }
}
