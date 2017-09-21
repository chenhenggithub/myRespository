package com.chen.queue;

/**
 * Created by Administrator on 2017/5/25.
 */
//线性队列
public class LinkQueue {
    private class Node{
        private Object date;
        private Node next;
        public Node(Object date,Node next){
            this.date=date;
            this.next=next;
        }
    }
    private Node front;
    private Node rear;
    private int size=0;
    public void add(Object o){
        if(rear==null){
            rear=new Node(o,null);
            front=rear;
        }else{
            Node newNode=new Node(o,null);
            rear.next=newNode;
            rear=rear.next;
        }
        size++;
    }
    public Object remove(){
        if(front==null){
            System.out.println("空");
        }
        Node n=front;
        Object o=n.date;
        front=n.next;
        n=null;
        size--;
        return o;
    }
    public int length(){
        return this.size;
    }
    public static void main(String[] args) {
        LinkQueue l=new LinkQueue();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l.length());
        System.out.println(l.remove());
        System.out.println(l.remove());
        System.out.println(l.remove());
    }
}
