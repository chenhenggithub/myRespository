package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/13.
 */
public class RW {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            while(true){
                int id=in.nextInt();
                if(id==0){
                    return;
                }
                int sum=in.nextInt();
                if(id>1024 || id<1 || sum>1024 || sum<1){
                    System.out.println(-1);
                }else{
                    if(id==sum){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                }
            }
        }
    }

}
