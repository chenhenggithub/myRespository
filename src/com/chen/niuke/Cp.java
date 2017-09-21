package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/19.
 * 时间限制：1秒
 空间限制：100768K
 小易有一个长度为N的正整数数列A = {A[1], A[2], A[3]..., A[N]}。
 牛博士给小易出了一个难题:
 对数列A进行重新排列,使数列A满足所有的A[i] * A[i + 1](1 ≤ i ≤ N - 1)都是4的倍数。
 小易现在需要判断一个数列是否可以重排之后满足牛博士的要求。
 输入描述:
 输入的第一行为数列的个数t(1 ≤ t ≤ 10),
 接下来每两行描述一个数列A,第一行为数列长度n(1 ≤ n ≤ 10^5)
 第二行为n个正整数A[i](1 ≤ A[i] ≤ 10^9)


 输出描述:
 对于每个数列输出一行表示是否可以满足牛博士要求,如果可以输出Yes,否则输出No。

 输入例子1:
 2
 3
 1 10 100
 4
 1 2 3 4

 输出例子1:
 Yes
 No
 */
public class Cp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (0<t--){
            int n=in.nextInt();
            int []data=new int [n];
            for(int i=0;i<n;i++){
                data[i]=in.nextInt();
            }
            String str= new Cp().fun(data);
            System.out.println(str);
        }
    }
    public String fun(int []a){
        int m=0;
        int con=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%4==0){
                m++;
            }else if(a[i]%2==0){
                con++;
            }

        }
        if(m>=a.length-m-con || a.length==0){
            return "Yes";
        }else{
            return  "No";
        }
    }
}
