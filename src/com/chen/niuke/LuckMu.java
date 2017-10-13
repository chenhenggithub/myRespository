package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/13.
 */
public class LuckMu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            while(in.hasNext()){
                int  a=in.nextInt();
                if(a==0){
                    return;
                }
                int mu=0;
                for(int i=1;i<=a;i++){
                    if(fun(i)){
                        mu++;
                    }
                }
                System.out.println(mu);
            }
        }


    }
    public static boolean fun(int sum){
        char[] a=Integer.toString(sum).toCharArray();
        char []s=Integer.toBinaryString(sum).toCharArray();
        int b=0;
        int c=0;
        for(int i:a){
            b+=i-'0';
        }
        for(int i:s){
            c+=i-'0';
        }
        return c==b;
    }
}
