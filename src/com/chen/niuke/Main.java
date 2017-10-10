package com.chen.niuke;


/**
 * Created by Administrator on 2017/9/22.
 */
//public class Main {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        while(in.hasNext()){
//            while(true){
//                int n=in.nextInt();
//                if(n==0){
//                    return;
//                }
//                int[] a=new int[n];
//                for(int i=0;i<n;i++){
//                    a[i]=in.nextInt();
//                }
//                new Main().fun(a,0,a.length-1);
//                Stack<Integer> stack=new Main().quChong(a);
//                while (!stack.isEmpty()){
//                    System.out.println(stack.pop());
//                }
//            }
//        }
//
//    }
//    public void fun(int []array,int low, int high) {
//        int i = low;
//        int j = high;
//        boolean flag = false;
//        if (i >= j) {
//            return;
//        }
//        while (i < j) {
//            if (array[i] < array[j]) {
//                int tamp=array[i];
//                array[i]=array[j];
//                array[j]=tamp;
//                flag=!flag;
//            }
//            if(flag){
//                i++;
//            }else{
//                j--;
//            }
//
//        }
//        fun(array,low,--i);
//        fun(array,++j,high);
//    }
//    public Stack<Integer> quChong(int []array){
//        Stack<Integer> stack=new Stack<Integer>();
//        stack.push(array[0]);
//        for(int i=1;i<array.length;i++){
//
//            if(stack.peek()!=array[i]){
//
//                stack.push(array[i]);
//            }
//        }
//        return stack;
//    }
//}
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/21.
 */
public class Main {


    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            while(true){

                int t=in.nextInt();
                if(t==0){
                    return;
                }
                int n=0;
                boolean flag=false;
                double m=Math.sqrt(t);
                for(int i=1;i<m;i++){
                    for(int j=i;j<m;j++){
                        if(i*i+j*j==t){
                            if(i==j){
                                flag=true;
                            }
                            n++;
                        }
                    }
                }
                n=8*n;
                if(flag){
                    n-=4;
                }
                int f=(int)m;
                if(f*f==t){
                    n= n+4;
                }
                System.out.println(n);
            }
        }

    }
}

