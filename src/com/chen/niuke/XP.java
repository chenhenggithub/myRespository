package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/11.
 */
public class XP {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        while(in.hasNext()){
//
//        }
        int n=in.nextInt();
        while(n-->0){
            int a=in.nextInt();
            int b= in.nextInt();
            int []c=new int[a*2];
            for(int i=0;i<a*2;i++){
                c[i]=in.nextInt();
            }
            c=funn(c,b);
            for(int i=0;i<c.length-1;i++){
                System.out.print(c[i]+" ");
            }
            System.out.println(c[c.length-1]);

        }
    }
    public static int[] fun(int[] a){
        int []b=new int[a.length];
        int j=0;
        boolean flag=true;
        for(int i=0;i<a.length/2;){
            if(flag){
                b[j++]=a[i++];
                flag=!flag;
            }else{
                b[j++]=a[a.length/2+i-1];
                flag=!flag;
            }
        }
        b[j]=a[a.length-1];
        return b;
    }
    public static int[] funn(int []a,int k){
        int[]b=a;
        for(int i=0;i<k;i++){
            b=fun(b);
        }
        return b;
    }
}
