package com.chen.niuke;

/**
 * Created by Administrator on 2017/9/21.
 * 归并排序
 */
public class MergeSort {

//    public void merge(int []array,int low,int mid,int high){
//        int i=low;
//        int j=mid+1;
//        int []a=new int [high-low+1];
//        int k=0;
//        while(i<=mid&&j<=high){
//            if(array[i]<array[j]){
//                a[k++]=array[i++];
//            }else{
//                a[k++]=array[j++];
//            }
//        }
//        while(i<=mid){
//            a[k++]=array[i++];
//        }
//        while(j<=high){
//            a[k++]=array[j++];
//        }
//        for(k=0;low<=high;low++){
//            array[low]=a[k++];
//        }
//
//    }
//    public void sort(int []array){
//        int i,j;
//        for(i=1;i<array.length;i=i*2){
//            for(j=0;j+2*i-1<array.length;j=j+2*i){
//                merge(array,j,j+i-1,j+2*i-1);
//            }
//            if(j+i-1<array.length){
//                merge(array,j,j+i-1,array.length-1);
//            }
//        }
//    }

    public void merge(int [] a,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int []b=new int[high-low+1];
        int k=0;
        while(i<=mid && j<=high){
            if(a[i]>a[j]){
                b[k++]=a[j++];
            }else{
                b[k++]=a[i++];
            }
        }
        while(i<=mid){
            b[k++]=a[i++];
        }
        while(j<=high){
            b[k++]=a[j++];
        }
        for(k=0;low<=high;){
            a[low++]=b[k++];
        }
    }
    public void sort(int []a){
        int i;
        for(i=1;i<a.length;i=i*2){
            int j;
            for(j=0;j+2*i-1<a.length;j=j+2*i){
                merge(a,j,j+i-1,j+2*i-1);
            }
            if(j+i-1<a.length){
                merge(a,j,j+i-1,a.length-1);
            }
        }
    }


    public static void main(String[] args) {
        int []a={2,4,1,99,78,5,2,0,4,1,67};
        new MergeSort().sort(a);
        for(int i:a){
            System.out.println(i);
        }

//        Scanner in=new Scanner(System.in);
//        while(in.hasNext()){
//            while(true){
//
//                int t=in.nextInt();
//                if(t==0){
//                    return;
//                }
//                int n=0;
//                double m=Math.sqrt(t);
//                for(int i=1;i<m;i++){
//                    for(int j=1;j<m;j++){
//                        if(i*i+j*j==t){
//                            System.out.println(i+"--"+j);
//                            n++;
//                        }
//                    }
//                }
//                n=4*n;
//                int f=(int)m;
//                if(f*f==t){
//                    n= n+4;
//                }
//                System.out.print(m+"-"+n);
//            }
//        }

    }
}
