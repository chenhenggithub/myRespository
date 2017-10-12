package com.chen.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/10.
 */
public class ABC {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String tamp=in.nextLine();
            String []ss=tamp.trim().split(" ");
            if(ss.length==1){
                return;
            }
            int a=Integer.parseInt(ss[0]);
            int b=Integer.parseInt(ss[1]);
            int c=Integer.parseInt(ss[2]);
            int d=Integer.parseInt(ss[3]);
                List<Integer> list=fun(a,b,c,d);

                if(list==null){
                    System.out.println("No");
                }else{
                    int z=list.remove(list.size()-1);
                    for(int i:list){
                        System.out.print(i+" ");
                    }
                    System.out.println(z);
                }

        }
    }
    public static List<Integer> fun(int a, int b, int c, int d){
        int x,y,z;
        x=(a+c)/2;
        y=x-a;
        z=y-b;

        if(x+y==c && y+z==d){
            List<Integer> list=new ArrayList<Integer>();
            list.add(x);
            list.add(y);
            list.add(z);
            return list;
        }
        return null;
    }
}
/*
* A-B B-C A+B B+C
* a b c d
* x y z
* a=x-y b=y-z c=x+y d=y+z
* a+y=x b+z=y y=c-x
* a+c-x=x
* x=a+c/2
* z=d-y
* y=b+d/2
* */
