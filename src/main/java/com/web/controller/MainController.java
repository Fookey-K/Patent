package com.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.web.entity.Menu;
import com.web.entity.SysUser;
import com.web.service.MainService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 孔慧真 on 2017/6/29.
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    MainService mainService;

    @RequestMapping("init.do")
    public String init(Model model, HttpSession session){
        //从session中获取user信息
        ServletContext application = session.getServletContext();
        SysUser user = (SysUser) application.getAttribute("userInfo");
        //根据user获取authroity
        String authroity = user.getAuthority();
        List<Menu> menuList = mainService.selectMenu(authroity);
        //将list转成string
        model.addAttribute("menuList", JSONArray.toJSONString(menuList));

        return "main";
    }
}
