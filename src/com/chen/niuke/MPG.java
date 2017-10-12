package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/10.
 */
public class MPG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            while(true){
                int a=in.nextInt();
                if(a==0){
                    return;
                }
                System.out.println(fun(a)==0?-1:fun(a));
            }
        }
    }
    public static int fun(int a){
        int tamp=0;
        if(a%8==0){
            tamp=a/8;
            return tamp;
        }else if(a%6==0){
            int t=a/6;
            int t1=0;
            while(t>=4){
                t-=4;
                t1+=3;
            }
            tamp=t+t1;
            return tamp;
        }else {
            int t=0;
            int t1=0;
            while(a>=6){
                a-=6;
                t+=1;
                if(a%8==0){
                    t1=a/8;
                    a=0;
                    break;
                }
            }
            if(a==0){
                while(t>=4){
                    t-=4;
                    t1+=3;
                }
                tamp=t+t1;
                return tamp;
            }

        }

        return 0;
    }


}
