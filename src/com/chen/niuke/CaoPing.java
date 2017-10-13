package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/13.
 */
public class CaoPing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int []a=new int[n];
        int []b=new int [n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();

        }
        for(int i=0;i<n;i++){

            b[i]=in.nextInt();
        }
        System.out.println(fu(a,b,1,1));
    }
    public static int juedui(int a,int b){
        if(a>b){
            return a-b;
        }else{
            return b-a;
        }
    }
    public static int fu(int []a,int []b,int x,int y){
        int l=juedui(a[0],x)+juedui(b[0],y);
        for(int i=1;i<a.length;i++){
            int t=juedui(a[i],x)+juedui(b[i],y);
            if(t<l){
                l=t;
            }
        }
        return l;
    }
}
