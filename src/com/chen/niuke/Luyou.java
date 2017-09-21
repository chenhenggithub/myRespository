package com.chen.niuke;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/19.
 * 时间限制：1秒
 空间限制：32768K
 魔法王国一共有n个城市,编号为0~n-1号,n个城市之间的道路连接起来恰好构成一棵树。
 小易现在在0号城市,每次行动小易会从当前所在的城市走到与其相邻的一个城市,小易最多能行动L次。
 如果小易到达过某个城市就视为小易游历过这个城市了,小易现在要制定好的旅游计划使他能游历最多
 的城市,请你帮他计算一下他最多能游历过多少个城市(注意0号城市已经游历了,游历过的城市不重复计算)。
 输入描述:
 输入包括两行,第一行包括两个正整数n(2 ≤ n ≤ 50)和L(1 ≤ L ≤ 100),表示城市个数和小易能行动的次数。
 第二行包括n-1个整数parent[i](0 ≤ parent[i] ≤ i), 对于每个合法的i(0 ≤ i ≤ n - 2),在(i+1)号城市和parent[i]间有一条道路连接。


 输出描述:
 输出一个整数,表示小易最多能游历的城市数量。

 输入例子1:
 5 2
 0 1 2 3

 输出例子1:
 3
 */
public class Luyou {
    private class Node{
        int data0;
        int pix;
        int jb;
        public Node (int data0,int pix,int jb){
            this.data0=data0;
            this.pix=pix;
            this.jb=jb;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] data=new int[2];
        for(int i=0;i<2;i++){
            data[i]=scanner.nextInt();
        }
        int []data1=new int[data[0]-1];
        for(int i=0;i<data[0]-1;i++){
            data1[i]=scanner.nextInt();
        }
       int r=new Luyou().fun(data,data1);
        System.out.println(r);

    }
    public int fun(int []a,int []b){
        Node [] data2=new Node[a[0]];
        data2[0]=new Node(b[0],-1,1);
        for(int i=0;i<a[0]-1;i++){
            data2[i+1]=new Node(i+1,b[i],data2[b[i]].jb+1);

        }
        int t=0;
        for(Node n:data2){
            t=t>n.jb?t:n.jb;
        }

        int r=0;
        if(t>=a[1]+1){
            r=a[1]+1;
        }else{
            r=t+(a[1]+1-t)/2;
        }
       //System.out.println(t+"----"+r+"-"+a[1]);
        return r;
    }
}
