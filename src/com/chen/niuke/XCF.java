package com.chen.niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/13.
 */
public class XCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String , String > map=new HashMap<String , String>();
        while(in.hasNext()){
            String s=in.next();
            if(!map.containsKey(s)){

                map.put(s,s);
            }
        }
        in.close();
        System.out.println(map.size());
    }


}
