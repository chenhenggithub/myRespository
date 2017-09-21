package com.chen.list;

/**
 * Created by Administrator on 2017/9/15.
 */
public class MyList <E>{
    private class Node{
        E data;
        Node next;
        public Node(E e,Node n){
            data=e;
            next=n;
        }

    }
    private Node font;
    private Node  rear;
    private int size=0;
    public MyList (){
        font=rear=null;
    }
    public void add(E e){
        if(font==null){
            font=rear=new Node(e,null);
            size++;
        }else{
            rear.next=new Node(e,null);
            rear=rear.next;
        }
        size++;
    }
    public void add(int index,E e){
        if(index<1 || index>size+1){
            return;
        }
        if(index==1){
            Node newNode=new Node(e,font);
            font=newNode;
            size++;
        }
        Node curNode=font;
        while(index>2){
            curNode=curNode.next;
            index--;
        }
        Node newNode=new Node(e,curNode.next);
        curNode.next=newNode;
        size++;
    }
    public E del(){
        if(font==null){
            return null;
        }
        Node curNode=font;

        if(curNode==rear){
            rear=font=null;
            size--;

        }else{
            while(curNode.next!=rear){
                curNode=curNode.next;
            }

            curNode.next=rear=null;
            rear=curNode;
            size--;
        }
        E e=curNode.data;
        return e;
    }
    public E del(int index){
        if(font==null || index>size){
            return  null;
        }
        Node n1=null;
        Node curNode=font;
        if(index==1){
            n1=font;
            font=font.next;
            size--;
        }else{
            while (index>2){
                curNode=curNode.next;
                index--;
            }
            n1=curNode.next;
            curNode.next=curNode.next.next;
            size--;
        }
        E e=n1.data;

        return e;
    }
    public E getElement(int index){
        Node curNode =font;
        while(index>1){
            curNode=curNode.next;
            index--;
        }
        return curNode.data;
    }
    public int lenght(){
        return  size;
    }
    public void clean(){

    }
}
