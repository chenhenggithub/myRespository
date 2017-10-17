package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/17.
 */
public class CBT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        String t=in.next();
        char[] chars=t.toCharArray();
        char[] chars1=s.toCharArray();
        int i=0,j=0;
        while(i<chars1.length){
            if(chars1[i++]==chars[j]){
                j++;
            }
            if(j==chars.length){
                break;
            }
        }
        if(j<chars.length){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }
    }
}
