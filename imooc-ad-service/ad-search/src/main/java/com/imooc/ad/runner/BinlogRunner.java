package com.imooc.ad.runner;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * @author jinghua
 * @date 2020年 10月23日 00:34:02
 **/
public class BinlogRunner implements CommandLineRunner {
    @Autowired
    private  BinaryLogClient  client;
    @Override
    public void run(String... args) throws Exception {
        client.connect();

    }
}
