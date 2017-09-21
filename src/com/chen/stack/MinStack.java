package com.chen.stack;

import java.util.Stack;

/**
 * Created by Administrator on 2017/4/14.
 */
//最小数栈
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack(){
        stack=new Stack<>();
        minStack=new Stack();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size(){
        return stack.size();
    }
    public void push(int e){
        if(minStack.isEmpty()){
            minStack.push(e);
        }else{
            if(e<=minStack.peek()){
                minStack.push(e);
            }
        }
        stack.push(e);
    }
    public Integer pop(){
        int a=stack.pop();
        if(a==minStack.peek()){
            minStack.pop();
        }
        return a;
    }
    public Integer getMin(){
        return minStack.peek();
    }
    public Integer peek(){
        return stack.peek();
    }
}
