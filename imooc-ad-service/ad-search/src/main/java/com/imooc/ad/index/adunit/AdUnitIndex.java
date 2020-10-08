package com.imooc.ad.index.adunit;

import com.imooc.ad.index.IndexAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author jinghua
 * @date 2020年 10月01日 10:46:35
 **/


@Slf4j
@Component
public class AdUnitIndex implements IndexAware<Long, AdUnitObject> {

   private   static Map<Long, AdUnitObject> objectMap;

   static {

            objectMap=new ConcurrentHashMap<>();

   }


    @Override
    public AdUnitObject get(Long key) {
            return objectMap.get(key);
    }

    @Override
    public void add(Long key, AdUnitObject value) {
            objectMap.put(key,value);
    }

    @Override
    public void update(Long key, AdUnitObject value) {

            log.info("before update {}" ,objectMap);
                AdUnitObject   oldObject=objectMap.get(key);

                if(null==oldObject){
                    objectMap.put(key, value);
                }else{
                    oldObject.update(value);
                }

            log.info("after  update {}" ,objectMap);

    }

    @Override
    public void delete(Long key, AdUnitObject value) {

        log.info("before delete {}" ,objectMap);
            objectMap.remove(key);
        log.info("after delete {}" ,objectMap);

    }
}
