package com.imooc.sender.kafka;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.imooc.ad.mysql.dto.MySqlRowData;
import com.imooc.sender.ISender;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author jinghua
 * @date 2020年 10月29日 21:15:05
 **/
@Component("kafkaSender")
public class KafKaSender implements ISender {
    @Value("${adconf.kafka.topic}")
    private  String  topic;
    @Autowired
    private  KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public void sender(MySqlRowData rowData) {
        kafkaTemplate.send(topic, JSON.toJSONString(rowData)); }


        @KafkaListener(topics = {"ad-search-mysql-data"},groupId ="ad-search")
     public  void processMysqlRowdata(ConsumerRecord<?,?> record){

         Optional<?> kafkaMessage=Optional.ofNullable(record.value());

         if(kafkaMessage.isPresent()){
                Object   message=kafkaMessage.get();
                MySqlRowData mySqlRowData= JSON.parseObject(message.toString(),MySqlRowData.class);
             System.out.println("kafka's RowData"+ JSON.toJSONString(mySqlRowData));

         }

     }
}
