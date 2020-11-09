package com.imooc.ad.utils;





import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author jinghua
 * @date 2020年 10月04日 14:27:40
 **/
@Slf4j
public class CommonUtils {

    public  static  <K,V>V getorCreate(K key, Map<K,V> map, Supplier<V> factory){

        return  map.computeIfAbsent(key,k->factory.get());

    }

    public  static String   stringConcat(String...args){

        StringBuffer result=new StringBuffer();
        for(String arg:args){
            result.append(arg);
            result.append("-");
        }
            result.deleteCharAt(result.length()-1);
        return  result.toString();
    }
    //Thu Jan 01 08:00:00 CST 1970
    public  static Date parseStringDate(String  dateString){

                try{
                    DateFormat dataFormat = new SimpleDateFormat("EEE MMM dd HH:mm ss zzz yyyyy", Locale.US);
                        return DateUtils.addHours(dataFormat.parse(dateString),-8);
                }catch (Exception e){
                            log.error("parseDate error:{}",dateString );
                            return  null;
                }
    }
}
