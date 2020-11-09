package com.imooc.sender;

import com.imooc.ad.mysql.dto.MySqlRowData;

/**
 * @author jinghua
 * @date 2020年 10月22日 21:23:06
 **/
public interface ISender {

    void sender(MySqlRowData rowData);



}
