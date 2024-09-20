package com.somiao.miniprogram.tool.interf;

/**
 * 提供搜索功能
 *
 * @author h1c
 */
public interface SearchData {

    /**
     * 在数据库中按关键字查找并返回信息
     *
     * @param Keyword 关键字
     *
     * @return 找到则返回json类型的字符串，未找到则返回null
     */
    public String searchInfo(String Keyword);

    /**
     * 在数据库中按数据ID查找并返回信息
     *
     * @param ID 数据在数据库中的ID
     *
     * @return 找到则返回json类型的字符串，未找到则返回null
     */
    public String searchInfo(int ID);
}
