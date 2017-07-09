package com.web.service;

import com.web.dao.MainDao;
import com.web.entity.Menu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Fookey on 2017/7/3.
 */
@Service("mainService")
public class MainServiceImpl implements MainService {

    @Resource
    MainDao mainDao;

    /**
     * 选择菜单
     * @param authroity
     * @return
     */
    public List<Menu> selectMenu(String authroity) {
        List<Menu> menuList = mainDao.selectMenu(authroity);
        return menuList;
    }
}
