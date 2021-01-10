package com.imooc.ad;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author jinghua
 * @date 2020年 11月13日 18:23:03
 **/
public class TEST {


    public static void main(String[] args) {
        //处理输入
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        int period_num=sc.nextInt();
        String[] period=new String[period_num];
        sc.nextLine();
        for(int i=0;i<period_num;i++){
            period[i]=sc.nextLine();
        }
        String between=sc.nextLine();
        //根据类型返回
       if(type==1){
            String[] result=type1(period,between);
           System.out.println(Arrays.toString(result));
       }else{
           String[] result=type2(period,between);
           System.out.println(Arrays.toString(result));
       }
    }
    public  static String[]   type1(String[] period,String between){

        List<String>   list=new LinkedList();
        String[]   a=between.split(",");
        int   start=Integer.parseInt(a[0]);
        int    end=Integer.parseInt(a[1]);
        for(String str: period){
            String[] split = str.split(",");
            if(Integer.parseInt(split[0])>start&&Integer.parseInt(split[1])<end){
                list.add(str);
            }
        }
        String[]  result=new String[list.size()];
        int i=0;
       for(String sre:list){
           result[i]=sre;
           i++;
       }
                    return result;
    }
    public   static String[]   type2(String[] period,String between){

        List<String>   list=new LinkedList();
        String[]   a=between.split(",");
        int   start=Integer.parseInt(a[0]);
        int    end=Integer.parseInt(a[1]);
        for(String str: period){
            String[] split = str.split(",");
            int temp_start=Integer.parseInt(split[0]);
            int temp_end=Integer.parseInt(split[1]);
            if((temp_start>start&&temp_start<end)||(temp_end>start&&temp_end<end)){
                list.add(str);
            }
        }
        String[]  result=new String[list.size()];
        int i=0;
        for(String sre:list){
            result[i]=sre;
            i++;
        }
        return result;
    }
}
