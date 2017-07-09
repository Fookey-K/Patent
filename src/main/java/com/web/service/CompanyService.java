package com.web.service;

import com.web.entity.Company;

import java.util.List;

/**
 * Created by Fookey on 2017/7/3.
 */
public interface CompanyService {

    List<Company> selectCmpMsg(String cmpId, String cmpName);
}
