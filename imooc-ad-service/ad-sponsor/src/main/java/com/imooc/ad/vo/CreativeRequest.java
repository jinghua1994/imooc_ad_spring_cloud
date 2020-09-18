package com.imooc.ad.vo;

import com.imooc.ad.constant.CommonStatus;
import com.imooc.ad.entity.Creative;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeRequest {

    private String  name;
    private  Integer type;
    private  Integer  height;
    private  Integer width;
    private  Integer materialType;
    private   Long  size;
    private Integer duration;
    private Long userId;
    private String  url;


    public Creative convertToEntity(){
        Creative  creative =new Creative();
        creative.setName(name);
        creative.setHeight(height);
        creative.setWidth(width);
        creative.setType(type);
        creative.setCreateTime(new Date());
        creative.setMaterialType(materialType);
        creative.setDuration(duration);
        creative.setUrl(url);
        creative.setSize(size);
        creative.setUserId(userId);
        creative.setAudit_status(CommonStatus.VALID.getStatus());


        return  creative;
    }
}
