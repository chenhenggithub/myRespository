package com.chen.niuke;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/11.
 */
public class XHS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        while(m-->0){
            int a=in.nextInt();
            LinkedList<Integer> link=fun(a);
            int n=link.size();
            for(int i=0;i<n-1;i++){
                System.out.print(link.pollFirst()+" ");
            }
            System.out.println(link.pollFirst());
        }



    }
    public static LinkedList<Integer> fun(int n){
        LinkedList<Integer> link=new LinkedList<Integer>();
        link.addFirst(n);
        for(int i=n-1;i>0;i--){
            link.addFirst(i);
            int x=link.pollLast();
            link.addFirst(x);
        }
        return link;
    }
}
