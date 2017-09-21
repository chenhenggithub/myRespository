package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/18.
 * 小易准备去魔法王国采购魔法神器,购买魔法神器需要使用魔法币,
 * 但是小易现在一枚魔法币都没有,但是小易有两台魔法机器可以通
 * 过投入x(x可以为0)个魔法币产生更多的魔法币。
 魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
 魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
 小易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法
 机器产生恰好n个魔法币,小易需要你帮他设计一个投入方案使他最
 后恰好拥有n个魔法币。
 输入描述:
 输入包括一行,包括一个正整数n(1 ≤ n ≤ 10^9),表示小易需要的魔法币数量。


 输出描述:
 输出一个字符串,每个字符表示该次小易选取投入的魔法机器。其中只包含字符'1'和'2'。

 */
public class mofa {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        String str=new mofa().mf(n,"");
        char [] c=str.toCharArray();
        int i,j;
        for(i=0,j=str.length()-1;i<j;i++,j--){
            char d;
            d=c[j];
            c[j]=c[i];
            c[i]=d;
        }
        String str1=new String(c);
        System.out.println(str1);
    }
    public String  mf(int n,String str){
        int m=n;

        if(m%2==0){
            m=(m-2)/2;
            str+="2";
        }else {
            m=(m-1)/2;
            str+="1";
        }
        if(m!=0) {

            return mf(m, str);
        }else {
            return str;
        }
    }
}
