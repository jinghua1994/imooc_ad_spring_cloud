package com.imooc.sender;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class test {

   static  class Solution {

        public static int myAtoi(String s) {
            s=s.trim();
            char c=s.charAt(0);
            int flag=1;
            if(c=='-'){
                flag=-1;
                s=s.substring(1);
            }
            //首字母是否为符号或者数字
            if(!Character.isDigit(s.charAt(0))){
                return 0;
            }

            int i=0;
            while(i<s.length()){
                if(Character.isDigit(s.charAt(i))){
                    i++;
                }else{
                    break;
                }
            }
            //切字符串
            s=s.substring(0,i);
            int result=Integer.parseInt(s)*flag;
            if(result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(result<Integer.MIN_VALUE) return  Integer.MIN_VALUE;
            return result;
        }
    }

    public static void main(String[] args) {
        String   temp_str="  -42";
        System.out.println(Solution.myAtoi(temp_str));
    }
}