package com.chen.queue;

/**
 * Created by Administrator on 2017/5/25.
 */
//顺序队列
public class MyQueue {
    private int QUEUE_SIZE = 10;
    private Object[] date;
    private int capacity;
    private int front = 0;
    private int rear = 0;

    public MyQueue() {
        capacity = QUEUE_SIZE;
        date = new Object[capacity];
    }

    public int length() {
        return rear-front;
    }
    public void add(Object o){
        date[rear++]=o;
    }
    public Object remove(){
        Object o=date[front];
        date[front++]=null;
        return o;
    }
    public Object element(int index){
        return date[front+index-1];
    }
    public boolean isEmpty(){
        return rear-front==0?true:false;
    }
    public void clear(){
        while(front==rear){
            date[front++]=null;
        }
    }
}