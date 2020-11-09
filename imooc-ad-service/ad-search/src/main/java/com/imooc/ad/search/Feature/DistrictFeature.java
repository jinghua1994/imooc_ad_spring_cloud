package com.imooc.ad.search.Feature;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author jinghua
 * @date 2020年 11月01日 12:34:04
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DistrictFeature {


    private List<ProvinceAndCity>  districts;


    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public   static  class ProvinceAndCity{

        private  String  Province;

        private  String   City;



    }
}
