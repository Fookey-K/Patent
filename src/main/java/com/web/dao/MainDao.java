package com.web.dao;

import com.web.entity.Menu;

import java.util.List;

/**
 * Created by Fookey on 2017/7/3.
 */
public interface MainDao {

    /**
     * 选择菜单
     * @param authroity
     * @return
     */
    List<Menu> selectMenu(String authroity);
}
