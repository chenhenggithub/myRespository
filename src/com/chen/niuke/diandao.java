package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/18.
 * 为了得到一个数的"相反数",我们将这个数的数字顺序颠倒,然后再加上原先的数得到"相反数"。
 * 例如,为了得到1325的"相反数",首先我们将该数的数字顺序颠倒,我们得到5231,之后再加上原先
 * 的数,我们得到5231+1325=6556.如果颠倒之后的数字有前缀零,前缀零将会被忽略。例如n = 100,
 * 颠倒之后是1.
 输入描述:
 输入包括一个整数n,(1 ≤ n ≤ 10^5)


 输出描述:
 输出一个整数,表示n的相反数

 输入例子1:
 1325

 输出例子1:
 6556
 */
public class diandao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        String str1=new diandao().dao(str);
        int h=new diandao().jia(str1,str);
        System.out.println(h);

    }
    public String  dao(String n){
        int i,j;
        char []a=n.toCharArray();
        for(i=0,j=n.length()-1;i<j;i++,j--){
            char c;
            c=a[i];
            a[i]=a[j];
            a[j]=c;
        }
        String str = new String (a);
        int m=0;
        while(a[m]=='0') {
            str=str.substring(1);
            m++;
        }
        return str;
    }
    public int jia(String m,String n){
        int h=Integer.parseInt(m)+Integer.parseInt(n);
        return  h;
    }
}
