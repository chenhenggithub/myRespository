package com.chen.niuke;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/25.
 */
public class HuiWen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            while (true){
                int n=in.nextInt();
                if(n==0){
                    return;
                }
                LinkedList<Integer> lk=new LinkedList<Integer>();
                for(int i=0;i<n;i++){
                    lk.add(in.nextInt());
                }

                System.out.println(fun(lk));
            }

        }



    }
    public static  int fun(LinkedList<Integer> lk){
        int t=0;
        int i=1;
        int j=lk.size();
        while(i<j){

            if(lk.getFirst()<(lk.getLast())){
                int m=lk.pollFirst();
                int n=lk.pollFirst();
                lk.addFirst(m+n);
                i++;
                t++;

            }else if(lk.getFirst()>lk.getLast()){

                int n=lk.pollLast();
                int m=lk.pollLast();
                lk.addLast(m+n);
                j--;
                t++;
            }else{
                i++;
                j--;
                lk.pollLast();
                lk.pollFirst();

            }

        }
      return t;
    }
}
