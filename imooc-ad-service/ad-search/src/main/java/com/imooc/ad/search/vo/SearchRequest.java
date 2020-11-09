package com.imooc.ad.search.vo;

import com.imooc.ad.search.Feature.DistrictFeature;
import com.imooc.ad.search.Feature.FeatureRelation;
import com.imooc.ad.search.Feature.ItFeature;
import com.imooc.ad.search.Feature.KeywordFeature;
import com.imooc.ad.search.vo.media.AdSlot;
import com.imooc.ad.search.vo.media.App;
import com.imooc.ad.search.vo.media.Device;
import com.imooc.ad.search.vo.media.Geo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author jinghua
 * @date 2020年 11月01日 10:13:56
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest {

    private  String mediaId;

    private  RequestInfo  requestInfo;

    private  FeatureInfo FeatureInfo;
    //请求基本信息
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public  static class RequestInfo{
        private String requestId;

        private List<AdSlot> adSlots;
        private App app;
        private Geo geo;
        private Device device;


    }
    //匹配信息
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public  static  class FeatureInfo{

        private KeywordFeature keywordFeature;
        private DistrictFeature districtFeature;
        private ItFeature itFeature;

        private FeatureRelation relation = FeatureRelation.AND;
    }



}
