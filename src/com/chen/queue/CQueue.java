package com.chen.queue;

/**
 * Created by Administrator on 2017/5/25.
 */
//循环队列
public class CQueue {
    private int QUEUE_SIZE=3;
    private int capecity ;
    private int rear=0;
    private int front=0;
    private Object[] date;
    public CQueue(){
        capecity=QUEUE_SIZE;
        date=new Object[capecity];
    }
    public void add(Object o){
        date[rear++]=o;
        rear=rear==this.capecity?0:rear;
    }
    public Object remove(){
        Object o=date[front];
        date[front++]=null;
        return o;
    }

    public static void main(String[] args) {
        CQueue c=new CQueue();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        System.out.println(c.remove());
        System.out.println(c.remove());
        System.out.println(c.remove());
    }
}
