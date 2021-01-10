package com.imooc.ad.client;

import com.imooc.ad.client.vo.AdPlan;
import com.imooc.ad.client.vo.AdPlanGetRequest;
import com.imooc.ad.vo.CommonResponse;

import java.util.List;

/**
 * @author jinghua
 * @date 2020年 09月29日 21:41:32
 **/
public class SponsorClientHystrix  implements SponsorClient{


    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(AdPlanGetRequest request) {



        return new CommonResponse<>(-1,"eureka-client-ad-sponsor-error");
    }
}
