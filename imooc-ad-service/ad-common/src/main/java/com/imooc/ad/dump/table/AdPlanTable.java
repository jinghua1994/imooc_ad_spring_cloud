package com.imooc.ad.dump.table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author jinghua
 * @date 2020年 10月20日 00:05:50
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdPlanTable {
    private  Long id;
    private  Long userId;
    private  Integer  planStatus;
    private Date startDate;
    private Date  endDate;


}
