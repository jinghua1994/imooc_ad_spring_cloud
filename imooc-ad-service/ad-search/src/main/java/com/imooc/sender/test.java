package com.imooc.sender;

/**
 * @author jinghua
 * @date 2020年 11月02日 09:38:16
 **/
public class test {


    public static void main(String[] args) {

        String s="1";
        String[]  temp=s.split(" ");
       int  count=0;
        for(String i:temp){
            System.out.println(i+"-"+count);
            count++;
        }
    }
}
