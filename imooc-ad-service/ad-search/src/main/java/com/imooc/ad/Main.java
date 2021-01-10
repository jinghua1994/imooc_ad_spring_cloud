package com.imooc.ad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author jinghua
 * @date 2020年 11月13日 18:43:31
 **/
public class Main {


    public static void main(String[] args) {
        //读取数据
        Scanner    sc=new Scanner(System.in);
        int house_num=Integer.parseInt(sc.nextLine());
        //把数据添加到list
        List<String>  str_list=new ArrayList<>();
         for(int i=0;i<house_num;i++){
             str_list.add(sc.nextLine());
        }
         String[]   sort_array=new String[house_num];
         int i=0;
        while (str_list.size()!=0){
            String temp_min=null;
            //按理原点距离排序
            int min=Integer.MAX_VALUE;
           for(String str:str_list){
               String ss=String.valueOf(str.split(" ")[1]);
               if(Integer.parseInt(ss)<=min){
                   min=Integer.parseInt(ss);
                   temp_min=str;
               }
           }
               sort_array[i++]=temp_min;
               str_list.remove(temp_min);
           }

            //按照排序好的数组求最大空间
            int start=0,end=0, max=0;
            for(int j=1;j<house_num-1;j++){
                int ii=Integer.parseInt(String.valueOf(sort_array[j+1].split(" ")[1]));
                if(Integer.parseInt(String.valueOf(sort_array[j].split(" ")[1]))-
                        Integer.parseInt(String.valueOf(sort_array[j-1].split(" ")[1]))>max){
                    start=j;
                    end=j+1;
                }
            }
        System.out.println(start+" "+end);
    }
}
