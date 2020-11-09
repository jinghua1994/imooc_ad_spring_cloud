package com.imooc.ad.index;

import lombok.Data;

/**
 * @author jinghua
 * @date 2020年 10月23日 10:40:04
 **/

public enum DataLevel {
    LEVEL_2("2","level2"),
    LEVEL_3("3","level3"),
    LEVEL_4("4","level4");

    private String level;
    private String  desc;


    public    String   getLevel(){

        return  this.level;
    }

    private DataLevel(String level,String desc){

        this.level=level;
        this.desc=desc;
    }




}
