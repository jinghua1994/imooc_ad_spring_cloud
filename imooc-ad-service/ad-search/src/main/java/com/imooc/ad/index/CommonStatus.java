package com.imooc.ad.index;

import lombok.Getter;

/**
 * @author jinghua
 * @date 2020年 11月01日 18:31:27
 **/
@Getter
public enum  CommonStatus {
    VALID(1,"有效状态"),
    INVALID(0,"无效状态");



      private  Integer  status;
        private String   desc;




        CommonStatus(Integer  status,String desc){
                this.status=status;
                this.desc=desc;


        }




}
