package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/13.
 */
public class Fibon {
    public static void main(String[] args) {
        int []a=fun(32);
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        int i=0;
        for(;i<30;i++){
            if(a[i]>=s){
                break;
            }
        }
        System.out.println(a[i]-s>s-a[i-1]?s-a[i-1]:a[i]-s);

    }
    public static int[] fun(int n){
        int []a=new int [n];
        a[0]=0;
        if(n>=2) {
            a[1] = 1;
            for (int i = 2; i < n; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
        }
        return a;
    }
}
