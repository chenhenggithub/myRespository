package com.chen.stack;

import java.util.Stack;

/**
 * Created by Administrator on 2017/5/25.
 */
public class YunSuanStack {
    public static void main(String[] args) {
        String s="(1+((2+3)*(4*5)))";
        char [] s1=s.toCharArray();
        Stack<Double> sh=new Stack<Double>();
        Stack<Character> fh=new Stack<Character>();
        for(int i=0;i<s1.length;i++){
            switch (s1[i]){

                case '(':break;
                case '*':fh.push(s1[i]);break;
                case '/':fh.push(s1[i]);break;
                case '-':fh.push(s1[i]);break;
                case '+':fh.push(s1[i]);break;
                case ')':
                    double val=0;
                    char c=fh.pop();
                    if(c=='+'){
                        val=sh.pop()+sh.pop();
                    }else if(c=='-'){
                        val=sh.pop()-sh.pop();
                    }else if(c=='*'){
                        val=sh.pop()*sh.pop();
                    }else if(c=='/'){
                        val=sh.pop()/sh.pop();
                    }


                    sh.push(val);
                    break;
                default:

                    sh.push((double)(s1[i]-48));
            }
        }
        System.out.println(sh.pop());
    }
}
