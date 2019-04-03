package com.debug.mooc.dubbo.one.api.service;

import com.debug.mooc.dubbo.one.api.response.BaseResponse;

/**
 * @Author: corey
 * @Date: 2019/4/1 14:21
 **/
public interface IDubboItemService {

    /**
     * 查询商品列表
     * @return
     */
    BaseResponse listItems();

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @return
     */
    BaseResponse listPageItems(Integer pageNo,Integer pageSize);

    /**
     * 分页模糊查询
     * @param pageNo
     * @param pageSize
     * @param search
     * @return
     */
    BaseResponse listPageItemsParams(Integer pageNo,Integer pageSize,String search);

}