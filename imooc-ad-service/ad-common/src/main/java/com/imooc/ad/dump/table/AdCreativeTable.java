package com.imooc.ad.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jinghua
 * @date 2020年 10月20日 00:27:07
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdCreativeTable {

    private Long AdId;
    private String name;
    private Integer type;
    private Integer  materialType;
    private Integer height;
    private Integer width;
    private Integer auditStatus;
    private String AdUrl;
}
