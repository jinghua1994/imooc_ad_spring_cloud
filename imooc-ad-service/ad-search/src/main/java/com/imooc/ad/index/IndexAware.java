package com.imooc.ad.index;

/**
 * @author jinghua
 * @date 2020年 09月30日 14:55:33
 **/
public interface IndexAware<K,V> {


   public  V  get(K key);
   public   void     add(K key,V value);
   public   void    update(K key,V value);
   public  void   delete (K key,V value);

}
