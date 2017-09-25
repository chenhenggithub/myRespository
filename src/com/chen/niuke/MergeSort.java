package com.chen.niuke;

/**
 * Created by Administrator on 2017/9/21.
 * 归并排序
 */
public class MergeSort {
//    public int [] merge(int []array, int low,int mid,int high){
//        int i=low;
//        int j=mid+1;
//        int k=0;
//        int[] tamp=new int [high-low+1];
//        while(i<=mid && j<=high){
//            if(array[i]<array[j]){
//                tamp[k++]=array[i++];
//            }else{
//                tamp[k++]=array[j++];
//            }
//
//        }
//
//        while(i<=mid){
//            tamp[k++]=array[i++];
//        }
//        while(j<=high){
//            tamp[k++]=array[j++];
//        }
//        for(k=0;low<=high;low++,k++){
//            System.out.print(k+"");
//            array[low]=tamp[k];
//        }
//        System.out.println();
//       return array;
//    }
    public void merge(int []array,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int []a=new int [high-low+1];
        int k=0;
        while(i<=mid&&j<=high){
            if(array[i]<array[j]){
                a[k++]=array[i++];
            }else{
                a[k++]=array[j++];
            }
        }
        while(i<=mid){
            a[k++]=array[i++];
        }
        while(j<=high){
            a[k++]=array[j++];
        }
        for(k=0;low<=high;low++){
            array[low]=a[k++];
        }

    }
    public void sort(int []array){
        int i,j;
        for(i=1;i<array.length;i=i*2){
            for(j=0;j+2*i-1<array.length;j=j+2*i){
                merge(array,j,j+i-1,j+2*i-1);
            }
            if(j+i-1<array.length){
                merge(array,j,j+i-1,array.length-1);
            }
        }
    }
//    public void sort(int [] array){
//
//        for(int i=1;i<array.length;i=i*2){
//            int j;
//            for(j=0;j+2*i-1<array.length;j=j+2*i){
//                merge(array,j,j+i-1,j+2*i-1);
//            }
//            if(j+i-1<array.length){
//                merge(array,j,j+i-1,array.length-1);
//            }
//        }
//
//    }

    public static void main(String[] args) {
        int []a={2,4,1,99,78,5,2,0,4,1,67};
        new MergeSort().sort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
