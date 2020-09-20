package com.imooc.ad.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.ICreativeService;
import com.imooc.ad.vo.CreativeRequest;
import com.imooc.ad.vo.CreativeResponse;
import com.imooc.ad.vo.CreativeUnitRequest;
import com.imooc.ad.vo.CreativeUnitResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CreativeOPController {


    @Autowired
    private ICreativeService creativeService;

    @PostMapping("/create/Creative")
    public CreativeResponse createCreative(@RequestBody CreativeRequest request) {

        log.info("ad-sponsor:createCreative->{}", JSON.toJSONString(request));

        return creativeService.createCreative(request);
    }



}
