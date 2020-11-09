package com.imooc.ad.mysql.listener;

import com.imooc.ad.mysql.dto.BinlogRowData;

/**
 * @author jinghua
 * @date 2020年 10月22日 14:21:02
 **/
public interface Ilistener {

    void register();


    void onEvent(BinlogRowData eventData);
}
