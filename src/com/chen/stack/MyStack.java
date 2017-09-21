package com.chen.stack;

/**
 * Created by Administrator on 2017/4/14.
 */
public class MyStack {
    private Object [] arg=new Object[1];
    private int size=0;
    public boolean isEmpty(){
        return size==0;
    }
    public void clear(){
        for(int i=0;i<size;i++){
            arg[i]=null;
        }
        size=0;
    }
    public int length(){
        return size;
    }
    public void push(Object o){
        if(arg.length<=size){
            Object [] a=new Object[arg.length+10];
            for(int i=0;i<arg.length;i++){
                a[i]=arg[i];
                arg[i]=null;
            }
            arg=a;
        }
        arg[size++]=o;

    }
    public Object pop() {
        if (size == 0) {
            System.out.println(new Exception("栈已空"));
            return "";
        } else {

            Object o = arg[--size];
            arg[size] = null;
            return o;
        }


    }
    public Object peek(){
        return arg[size-1];
    }

}
