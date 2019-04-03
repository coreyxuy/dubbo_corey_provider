package com.debug.mooc.dubbo.one.api.service;

import com.debug.mooc.dubbo.one.api.request.PushOrderDto;
import com.debug.mooc.dubbo.one.api.response.BaseResponse;

/**
 * Created by corey
 * on 2019/4/10
 */
public interface IDubboRecordService {

    /**
     * 用户下单
     *
     * @param dto
     * @return
     */
    BaseResponse pushOrder(PushOrderDto dto);

}
