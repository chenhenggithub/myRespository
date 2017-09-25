package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/20.
 */
public class KH {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int str1=in.nextInt();
        int str2=in.nextInt();
        if(str.equals("Q")) {
            System.out.println(str);
        }
        //int t=in.nextInt();
//        System.out.println(new KH().fun(str));

    }
//    public int fun(String str){
//        char []ch=str.toCharArray();
//        int len=ch.length/2;
//        int count=sumcount(len);
//
//        return 0;
//    }
//    //相同的合法括号匹配序总个数(包含已给的)
//    public int sumcount(int len){
//        if(len==1){
//            return 1;
//        }
//        int is=1;
//        for(int i=1;i<len;i++){
//            is+=i*sumcount(len-i);
//
//        }
//
//       return is;
//    }
}
