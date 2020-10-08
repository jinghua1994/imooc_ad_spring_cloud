package com.imooc.ad.index.creative;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jinghua
 * @date 2020年 10月06日 19:19:17
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeObject {
    private Long adId;
    private String   name ;
    private  Integer type;
    private String  materialType;
    private  Integer  height;
    private  Integer  width;
    private  Integer  auditStatus;
    private   String   adUrl;
    public  void update(CreativeObject newObject){

        if (null != newObject.getAdId()) {
            this.adId = newObject.getAdId();
        }
        if (null != newObject.getName()) {
            this.name = newObject.getName();
        }
        if (null != newObject.getType()) {
            this.type = newObject.getType();
        }
        if (null != newObject.getMaterialType()) {
            this.materialType = newObject.getMaterialType();
        }
        if (null != newObject.getHeight()) {
            this.height = newObject.getHeight();
        }
        if (null != newObject.getWidth()) {
            this.width = newObject.getWidth();
        }
        if (null != newObject.getAuditStatus()) {
            this.auditStatus = newObject.getAuditStatus();
        }
        if (null != newObject.getAdUrl()) {
            this.adUrl = newObject.getAdUrl();
        }

    }

}