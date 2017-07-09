package com.web.controller;

import com.web.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Fookey on 2017/7/3.
 */
@Controller
@RequestMapping("/cmp")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @RequestMapping("init.do")
    public String companyInit(){


        return "company";
    }

}
