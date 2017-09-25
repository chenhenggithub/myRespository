package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/25.
 */
public class highcore {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            while(true){

                int t=in.nextInt();
                if(t==0){
                    return;
                }
                int t1=in.nextInt();
                int []array=new int [t];
                for(int i=0;i<t;i++){
                    array[i]=in.nextInt();
                }
                int s;
                for(int i=0;i<t1;i++){
                    String str=in.next();

                    int n=in.nextInt();
                    int m=in.nextInt();
                    if(str.equals("Q")){
                        if(m<n){
                            int e=m;
                            m=n;
                            n=e;
                        }
                        s=fun(array,n,m);

                        System.out.println(array[s]);
                    }else{
                        array[n-1]=m;
                    }

                }
            }
        }

    }
    public static  int fun(int []a,int low,int high){
        int t=low-1;
        int mun=a[low-1];

        for( int i=low;i<high;i++){
            if(a[i]>mun){
                mun=a[i];
                t=i;

            }
        }

        return t;
    }
}
