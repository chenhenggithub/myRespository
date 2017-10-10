package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/9.
 * 对于一个整数X，定义操作rev(X)为将X按数位翻转过来，并且去除掉前导0。例如:
 如果 X = 123，则rev(X) = 321;
 如果 X = 100，则rev(X) = 1.
 现在给出整数x和y,要求rev(rev(x) + rev(y))为多少？
 输入描述:
 输入为一行，x、y(1 ≤ x、y ≤ 1000)，以空格隔开。


 输出描述:
 输出rev(rev(x) + rev(y))的值

 输入例子1:
 123 100

 输出例子1:
 223
 */
public class PZJ {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            while(true){
                String a=in.next();
                if(a.equals("0")){
                    return;
                }
                String b=in.next();
                int s=rev(Integer.toString((rev(a)+rev(b))));
                System.out.println(s);
            }
        }
    }
    public static int rev(String a){
        char[] chars=a.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            char ch=chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=ch;
        }
        String s=new String(chars);
        int  j=0;
        while(chars[j]=='0'){
            s.substring(1);
            j++;
        }
        return Integer.parseInt(s);
    }
}
