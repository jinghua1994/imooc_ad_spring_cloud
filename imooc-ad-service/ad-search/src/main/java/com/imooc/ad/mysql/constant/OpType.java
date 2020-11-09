package com.imooc.ad.mysql.constant;


import com.github.shyiko.mysql.binlog.event.EventType;

/**
 * @author jinghua
 * @date 2020年 10月20日 14:41:30
 **/
public enum OpType {

        ADD,DELETE,UPDATE,OTHER;

        public static OpType   to(EventType eventType){
                switch (eventType){
                        case EXT_WRITE_ROWS:
                                return  ADD;
                        case EXT_UPDATE_ROWS:
                                return UPDATE;
                        case EXT_DELETE_ROWS:
                                return  DELETE;
                                default:
                                return OTHER;



                }
        }
}
