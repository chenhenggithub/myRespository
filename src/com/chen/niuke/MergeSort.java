package com.chen.niuke;

/**
 * Created by Administrator on 2017/9/21.
 * 归并排序
 */
public class MergeSort {
    public void merge(int [] array,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int c=0;
        int data[]=new int[high-low+1];
        while(i<=mid&&j<=high){
            if(array[i]<array[j]){
                data[c]=array[i];
                i++;
                c++;
            }else{
                data[c]=array[j];
                j++;
                c++;
            }
        }
        while(i<=mid){
            data[c]=array[i];
            i++;
            c++;
        }
        while(j<=high){
            data[c]=array[j];
            j++;
            c++;
        }
        for(c=0,i=low;i<=high;c++,i++){
            array[i]=data[c];
        }
    }
    public void mergePass(int []array,int  gap,int length){
        int i;
        for(i=0;i+2*gap-1<length;i=i+2*gap){
            merge(array,i,i+gap-1,i+2*gap-1);
        }
        if(i+gap-1<length){
            merge(array,i,i+gap-1,length-1);
        }
    }
    public int[] sort(int [] array){
        int gap;
        for(gap=1;gap<array.length;gap=gap*2){
            mergePass(array,gap,array.length);
        }
        return array;
    }

    public static void main(String[] args) {
        int []a={2,4,1,99,78,5,2,0,4,1,67};
        int []b=new MergeSort().sort(a);
        for(int i:b){
            System.out.println(i);
        }
    }
}
