package com.imooc.ad.mysql.dto;

import com.imooc.ad.mysql.constant.OpType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jinghua
 * @date 2020年 10月22日 20:25:02
 **/
@Data
public class MySqlRowData {

    private String tableName;
    private String level;
    private OpType  opType;

    private List<Map<String,String>> fieldValueMap=new ArrayList<>();

}
