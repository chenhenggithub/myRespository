package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/21.
 * 选择排序
 */
public class XZPX {
    public static void main(String[] args) {
        int a[]={3,1,75,58,9,1,0,44};
          Scanner in=new Scanner(System.in);
//        String str=in .nextLine();
//        String [] a=str.trim().split(" ");
//        while(true){
//            in.nextInt();
//
//        }
        new XZPX().sortfun(a);
        for(int i:a){
            System.out.print(i);
        }
    }
    public void sortfun(int [] data){
        for(int i=1;i<data.length;i++){
            if(data[i]<data[i-1]){
                int j=i-1;
                int a=data[i];
                while(j>=0&&a<data[j]){
                    data[j+1]=data[j];
                    j--;

                }
                data[j+1]=a;
//                for(int x:data){
//                    System.out.print(x+"  ");
//                }
//                System.out.println();
            }
        }


    }
}
