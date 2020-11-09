package com.imooc.ad.service;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.event.DeleteRowsEventData;
import com.github.shyiko.mysql.binlog.event.EventData;
import com.github.shyiko.mysql.binlog.event.UpdateRowsEventData;
import com.github.shyiko.mysql.binlog.event.WriteRowsEventData;

import java.io.IOException;

/**
 * @author jinghua
 * @date 2020年 10月21日 11:58:10
 **/
public class BInlogServiceTest {


    public static void main(String[] args) throws Exception {
        BinaryLogClient binaryLogClient=new BinaryLogClient(
                "127.0.0.1",3306,"root","626494jinghua"
        );
       // binaryLogClient.setBinlogFilename("binlog.000037");
        binaryLogClient.registerEventListener(p->{
            EventData data=p.getData();
            if(data instanceof UpdateRowsEventData){
                System.out.println("Update-------------");
                System.out.println(data.toString());
            }
            if(data instanceof DeleteRowsEventData){
                System.out.println("Delete-------------");
                System.out.println(data.toString());
            }
            if(data instanceof WriteRowsEventData){
                System.out.println("Write-------------");
                System.out.println(data.toString());
            }

        });
        binaryLogClient.connect();
    }
}
