package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/29.
 */
public class MangFish {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            while(true){
                int n=in.nextInt();
                if(n==0){
                    return;
                }
                int m=in.nextInt();
                int n1=in.nextInt();
                int []a=new int[n1];
                for(int i=0;i<n1;i++){
                    a[i]=in.nextInt();
                }
                System.out.println(sort(a,n,m));
            }
        }
    }

    public static int sort(int []a,int b,int c){
        int n=0;
        boolean []arry=new boolean[c-b+1];
       for(int i=b;i<=c;i++){
           for(int m:a){
               if((m*10>=i && m*2<=i) || (i*10>=m && i*2<=m)){
                   arry[i-b]=false;   //被吃掉，吃鱼的刷新成false
                   break;
               }
               arry[i-b]=true;   //不被吃掉，不吃鱼的改成true
           }
       }
        for(boolean x:arry){
            if(x){
                n++;   //统计都多少不被吃，不吃鱼
            }
        }
        return n;
    }
}
