package com.web.service;

import com.web.dao.CompanyDao;
import com.web.entity.Company;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Fookey on 2017/7/3.
 */
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

    @Resource
    CompanyDao companyDao;

    public List<Company> selectCmpMsg(String cmpId, String cmpName) {
        System.out.println(">>>>>>>>>>companyStart");
        List<Company> cmpList = companyDao.selectCmpMsg(cmpId,cmpName);
        System.out.println(">>>>>>>>>>>>companyEnd");
        return cmpList;
    }
}
