package com.somiao.miniprogram.controller;

import com.alibaba.fastjson.JSONObject;
import com.somiao.miniprogram.entity.Cat;
import com.somiao.miniprogram.tool.interf.DownloadData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Base64;

/**
 * 用于下载数据
 *
 * @author h1c
 */
@RestController
public class DownloadController {

    /**
     * 下载器
     */
    private DownloadData downloadData;

    @GetMapping("/getCatInfo")
    public List<Cat> getCatInfo(@RequestParam String type, @RequestParam String keywords) {

        return downloadData.downloadString(type, keywords);
    }

    @GetMapping(value = "getCatImage")
    public ResponseEntity<String> getCatImage(@RequestParam String path) {

        String encodedImage = Base64.getEncoder().encodeToString(downloadData.downloadImage(path));
        JSONObject json = new JSONObject();
        json.put("image", encodedImage);

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(json.toString());
    }

    /**
     * Setter注入
     *
     * @param downloadData Setter注入
     */
    @Autowired
    @Qualifier("DownloadCatInfo")
    public void setDownloadData(DownloadData downloadData) {

        this.downloadData = downloadData;
    }
}
