package com.imooc.ad.index.adplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author jinghua
 * @date 2020年 09月30日 15:37:23
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanObject {


    private  Long   PlanId;

    private  Long userId;

    private Integer  planStatus;

    private Date   startDate;

    private  Date   endDate;



    public   void update(AdPlanObject newObject){
        if(null!=newObject.getPlanId()){
            this.PlanId=newObject.getPlanId();
        }
        if(null!=newObject.getUserId()){
            this.userId=newObject.getUserId();
        }
        if(null!=newObject.getPlanStatus()){
            this.planStatus=newObject.getPlanStatus();
        }
        if(null!=newObject.getStartDate()){
            this.startDate=newObject.getStartDate();
        }
        if(null!=newObject.getEndDate()){
            this.endDate=newObject.getEndDate();
        }
    }
}
