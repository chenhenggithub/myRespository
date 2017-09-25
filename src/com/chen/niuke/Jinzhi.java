package com.chen.niuke;

/**
 * Created by Administrator on 2017/9/22.
 */
public class Jinzhi {
    public static void main(String[] args) {
        int [][]b={{1,2,3},{4,5,6},{7,8,7},{10,11,12}};

        fun(b,8);
        System.out.println(b[0].length+"---"+b.length);
//        System.out.println(Integer.toHexString(11));
//        System.out.println(Integer.valueOf("11",8).toString());
//        String s="asd";
//        StringBuffer sb=new StringBuffer();
//        Scanner in =new Scanner(System.in);
//        while(in.hasNext()){
//            while(true){
//                String str=in.next();
//                if(str.equals("0")){
//                    return;
//                }
//                str=str.substring(2);
//                System.out.println(Integer.valueOf(str,16).toString());
//            }
//        }

    }
//    public static int fun(){
//        try {
//
//            int l=3/0;
//            return 1;
//        } catch (Exception e) {
//
//            e.printStackTrace();
////            return 4;
//        } finally {
//            System.out.println(3);
//
//        }
//        return 0;
//    }
    public static void fun(int [][]a,int b){
//        System.out.println(a[0].length+"---"+a.length);
        int i,j;
        for(i=0,j=0;i<a[0].length&&j<a.length;i++,j++){
            if(a[j][i]>=b){
                break;
            }
        }
//        System.out.println(i);
        while(i<a[0].length){

            if(a[j-1][i]>b){
                break;
            }
            i++;
        }
        while(j<a.length){

            if(a[j][i-1]>b){

                break;
            }
            j++;
        }

        System.out.println(i-1+"--"+j);

    }
}
