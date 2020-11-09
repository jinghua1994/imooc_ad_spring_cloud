package com.imooc.ad.search.vo.media;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.CORBA.INTERNAL;

import java.util.List;

/**
 * @author jinghua
 * @date 2020年 11月01日 10:52:08
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdSlot {
    private  String  adSlotCode;

    private Integer  positionType;

    private Integer width;

    private  Integer  height;

    private List<Integer>   type;
    //最低出价
    private Integer minCpm;

 }
