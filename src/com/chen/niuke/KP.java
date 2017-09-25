package com.chen.niuke;

/**
 * Created by Administrator on 2017/9/20.
 * 快速排序
 */
public class KP {
    public static void main(String[] args) {
        int [] a={2,4,1,99,78,5,2,0,4,1,67};
        new KP().fastsort(a,0,a.length-1);
        for(int i:a){
            System.out.println(i);
        }
    }

//    public void fastsort(int []data,int low,int high){
//        int i=low;
//        int j=high;
//        boolean flag=false;
//        while (i>=j){
//            return;
//        }
//        while (i<j){
//            if(data[i]>data[j]){
//                int tamp=data[i];
//                data[i]=data[j];
//                data[j]=tamp;
//                flag=!flag;
//            }
//            if(flag){
//                i++;
//            }else{
//                j--;
//            }
//        }
//        fastsort(data,low,--i);
//        fastsort(data,++j,high);
//
//    }
    public void fastsort(int[] data,int low,int high){
        int i=low;
        int j=high;
        boolean flag=false;
        if(i>=j){
            return;
        }
        while(i<j){
//            从大到小
            if(data[i]<data[j]){
                int tamp=data[i];
                data[i]=data[j];
                data[j]=tamp;
                flag=!flag;
            }
            if(flag){
                i++;
            }else{
                j--;
            }
        }
        fastsort(data,low,--i);
        fastsort(data,++j,high);

    }


}
