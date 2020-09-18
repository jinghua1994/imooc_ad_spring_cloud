package com.imooc.ad.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IAdPlanService;
import com.imooc.ad.vo.AdPlanRequest;
import com.imooc.ad.vo.AdPlanResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AdPlanOPController {


        @Autowired
      private IAdPlanService   iAdPlanService;
        @PostMapping("/create/adPlan")
      public AdPlanResponse   createAdPlan(@RequestBody AdPlanRequest  request) throws AdException {



        log.info("ad-sponsor:createAdPlan->{}", JSON.toJSONString(request));

          return  iAdPlanService.createAdPlan(request);
      }
}
