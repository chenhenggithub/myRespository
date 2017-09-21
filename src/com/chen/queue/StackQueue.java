package com.chen.queue;

import com.chen.stack.MyStack;

import java.util.Stack;

/**
 * Created by Administrator on 2017/5/25.
 */
public class StackQueue {
    private Stack fstack;
    private MyStack rstack;
    private int size;
    public StackQueue(){
        fstack=new Stack();
        rstack=new MyStack();
    }
    public void add(Object o){
        fstack.push(o);
    }
    public Object remove(){
        Stack m=new Stack();

        while(!fstack.isEmpty()){

            m.push(fstack.pop());
        }

        Object o=m.pop();
        while(!m.isEmpty()){
            fstack.push(m.pop());
        }
        return o;
    }

    public static void main(String[] args) {
        StackQueue s=new StackQueue();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }
}
