package com.imooc.ad.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.ad.annotation.IgnoreResponseAdvice;
import com.imooc.ad.client.SponsorClient;
import com.imooc.ad.client.vo.AdPlan;
import com.imooc.ad.client.vo.AdPlanGetRequest;
import com.imooc.ad.search.ISearch;
import com.imooc.ad.search.vo.SearchRequest;
import com.imooc.ad.search.vo.SearchResponse;
import com.imooc.ad.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author jinghua
 * @date 2020年 09月21日 13:34:47
 **/
@RestController
@Slf4j
public class SearchController{
    @Autowired
    private  ISearch search;

        @Autowired
    private RestTemplate restTemplate;

        @Autowired
        private SponsorClient sponsorClient;

        @IgnoreResponseAdvice
        @PostMapping("/getAdPlans")
    public CommonResponse<List<AdPlan>>    getAdPlans(@RequestBody AdPlanGetRequest request){

        log.info("ad-sponsor:getAdPlanByRibbon->{}", JSON.toJSONString(request));

                return  sponsorClient.getAdPlans(request);

    }

    @PostMapping("/fetchAds")
    public SearchResponse fetchAds(@RequestBody SearchRequest request) {

        log.info("ad-search: fetchAds -> {}",
                JSON.toJSONString(request));
        return search.fetchAds(request);
    }


        @IgnoreResponseAdvice
        @PostMapping("/getAdPlanByRibbon")
        @SuppressWarnings("all")
        public CommonResponse<List<AdPlan>>  getAdPlanByRibbon(@RequestBody AdPlanGetRequest request) {

            log.info("ad-sponsor:getAdPlanByRibbon->{}", JSON.toJSONString(request));

            return
                    restTemplate.postForEntity("http://eureka-client-ad-sponsor/ad-sponsor/get/adPlan"
                            ,request,CommonResponse.class).getBody();
        }

}
