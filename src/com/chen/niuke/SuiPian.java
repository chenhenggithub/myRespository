package com.chen.niuke;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2017/9/18.
 * 时间限制：1秒
 空间限制：32768K
 一个由小写字母组成的字符串可以看成一些同一字母的最大碎片组成的。
 例如,"aaabbaaac"是由下面碎片组成的:'aaa','bb','c'。牛牛现在给定
 一个字符串,请你帮助计算这个字符串的所有碎片的平均长度是多少。

 输入描述:
 输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s只含小写字母('a'-'z')


 输出描述:
 输出一个整数,表示所有碎片的平均长度,四舍五入保留两位小数。

 如样例所示: s = "aaabbaaac"
 所有碎片的平均长度 = (3 + 2 + 3 + 1) / 4 = 2.25

 输入例子1:
 aaabbaaac

 输出例子1:
 2.25
 */
public class SuiPian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Stack<Integer> list = new SuiPian().sui(str);
        int sum = 0;

        int lan = list.size();
        while (!list.isEmpty()) {
            sum += list.pop();
        }

        double s = sum * 1.0 / lan;
        String result = String.format("%.2f", s);
        System.out.println(result);
    }

    public Stack<Integer> sui(String n) {

        Stack<Integer> stack = new Stack<Integer>();
        char[] a = n.toCharArray();
        int i;
        stack.push(1);
        for (i = 1; i < a.length;i++ ) {

           if(a[i]==a[i-1]) {
               int t=stack.pop();
               t+=1;
               stack.push(t);
           }else{
              stack.push(1);
           }
        }
        return stack;
    }
}
