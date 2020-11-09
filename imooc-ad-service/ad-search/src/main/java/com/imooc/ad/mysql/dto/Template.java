package com.imooc.ad.mysql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author jinghua
 * @date 2020年 10月21日 14:19:54
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Template {
    private String database;
    private List<JsonTable>  tableList;
}
