package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/17.
 */
public class DeleteS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String s1=in.nextLine();
        char []chars=s1.toCharArray();
        for(char i:chars){
            s=s.replaceAll(String.valueOf(i),"");
        }
        System.out.println(s);
    }
}
