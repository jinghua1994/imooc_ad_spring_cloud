package com.imooc.ad.client.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author jinghua
 * @date 2020年 09月21日 00:29:06
 **/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdPlanGetRequest {


    private List<Long> ids;
    private Long userId;

}
