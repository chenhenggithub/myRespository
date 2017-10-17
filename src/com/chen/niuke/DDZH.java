package com.chen.niuke;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2017/10/12.
 */
public class DDZH {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            while(true){
                int n=in.nextInt();
                if(n==0){
                    return;
                }
                int [] a=new int [n];
                for(int i=0;i<n;i++){
                    a[i]=in.nextInt();
                }
                System.out.println(fun(a));
            }
        }
    }
    public static int bj(int a,int b){
        if(a>b){
            return a-b;
        }else{
            return b-a;
        }
    }
    public static int fun(int []a){
        int sum=0;
        Stack<Integer> q=new Stack<Integer>();
        Stack<Integer> n=new Stack<Integer>();
        q.add(a[0]);
        for(int i=1;i<a.length-1;i++){
            if(n.isEmpty()){
                if(bj(q.peek(),a[i])>=bj(a[i+1],a[i])) {
                    sum += bj(a[i + 1], a[i]);
                    n.add(a[i++]);
                    n.add(a[i]);
                    continue;
                }else{
                    sum+=bj(q.peek(),a[i]);
                    q.add(a[i]);
                }
            }else{
                if(bj(q.peek(),a[i])>bj(n.peek(),a[i])){
                    sum+=bj(n.peek(),a[i]);
                    n.add(a[i]);

                }else{
                    sum+=bj(q.peek(),a[i]);
                    q.add(a[i]);

                }
            }

        }
        if(bj(q.peek(),a[a.length-1])>bj(n.peek(),a[a.length-1])){
            sum+=bj(n.peek(),a[a.length-1]);
            n.add(a[a.length-1]);

        }else{
            sum+=bj(q.peek(),a[a.length-1]);
            q.add(a[a.length-1]);

        }
        int sumq=0;
        int sumn=0;

        while(!q.isEmpty()){
            int s=q.pop();
            if(!q.isEmpty()){
                sumq+=bj(s,q.peek());
            }

            System.out.print(s+" ");
        }

        System.out.println();
        System.out.println(sumq);
        while(!n.isEmpty()){
            int s=n.pop();
            if(!n.isEmpty()){
                sumn+=bj(s,n.peek());
            }
            System.out.print(s+" ");
        }

        System.out.println();
        System.out.println(sumn);

        return sum;
    }
}
