package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/10.
 */
public class JYSH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            while(true){
                long a=in.nextInt();
                if(a==0){
                    return;
                }

                System.out.println(sum(a));
            }
        }
    }






    public static long sum(long a){
        long tamp=0;

        for(long i=a;i>0;i=i/2){
            long t=(i+1)/2;
            tamp+=t*t;

        }
        return tamp;
    }
}
