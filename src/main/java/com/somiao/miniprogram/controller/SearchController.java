package com.somiao.miniprogram.controller;

import com.somiao.miniprogram.tool.impl.SearchCatImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用于控制搜索
 *
 * @author h1c
 */
//@RestController
public class SearchController {

    /**
     * 搜索猫
     */
    private SearchCatImpl searchCat;

    /**
     * 查到并返回信息
     *
     * @param catName 猫的名字
     *
     * @return 找到则返回json类型的字符串，未找到则返回null
     */
    //@PostMapping("/searchCat")
    public ResponseEntity<String> getCatInfo(@RequestParam("name") String catName) {

        return new ResponseEntity<>(this.searchCat.searchInfo(catName), HttpStatus.OK);
        //return null;
    }

    /**
     * Setter注入
     *
     * @param searchCatImpl Setter注入
     */
    @Autowired
    @Qualifier("SearchCat")
    public void setSearchCat(SearchCatImpl searchCatImpl) {

        this.searchCat = searchCatImpl;
    }

}
