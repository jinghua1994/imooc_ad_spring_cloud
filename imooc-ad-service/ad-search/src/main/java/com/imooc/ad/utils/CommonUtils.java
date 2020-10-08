package com.imooc.ad.utils;

import java.util.Map;
import java.util.function.Supplier;

/**
 * @author jinghua
 * @date 2020年 10月04日 14:27:40
 **/
public class CommonUtils {

    public  static  <K,V>V getorCreate(K key, Map<K,V> map, Supplier<V> factory){

        return  map.computeIfAbsent(key,k->factory.get());

    }
}
