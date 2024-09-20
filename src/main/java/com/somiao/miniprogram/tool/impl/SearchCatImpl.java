package com.somiao.miniprogram.tool.impl;

import com.somiao.miniprogram.dao.SearchCatDao;
import com.somiao.miniprogram.entity.Cat;
import com.somiao.miniprogram.tool.interf.SearchData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 查找猫的信息
 *
 * @author h1c
 */
@Service("SearchCat")
public class SearchCatImpl implements SearchData {

    /**
     * 猫
     */
    private Cat          cat = new Cat();
    /**
     * 猫的json信息
     */
    private String       catInfoJson;
    /**
     * 数据库接口
     */
    private SearchCatDao searchCatDao;

    /**
     * 获取猫
     *
     * @return 猫
     */
    public Cat getCat() {

        return this.cat;
    }

    /**
     * 把猫的信息转为json字符串
     *
     * @return json字符串
     */
//    @Override
//    public String toString() {
//
//        //数据库查询接口
//        //@Autowired
//        ////////////////
//
//        //查到的字符串存入map，方便转json
//        Map<String,String> catInfoMap=new HashMap<>(20);
//
//        //存入map
//        //catInfoMap.put();
//        ////////////////
//
//        //转json
//        //this.catInfoJson=
//    }

    /**
     * 根据猫的名字在数据库中查找信息
     *
     * @param catName 猫的名字
     *
     * @return 找到则返回json类型的字符串，未找到则返回null
     */
    @Override
    public String searchInfo(String catName) {

        return null;
    }

    /**
     * 在数据库中按数据ID查找并返回信息
     *
     * @param ID 数据在数据库中的id
     *
     * @return 找到则返回json类型的字符串，未找到则返回null
     */
    @Override
    public String searchInfo(int ID) {

        return null;
    }

    /**
     * Setter注入
     *
     * @param searchCatDao Setter注入
     */
    @Autowired
    private void setSearchCatDao(SearchCatDao searchCatDao) {

        this.searchCatDao = searchCatDao;
    }
}
