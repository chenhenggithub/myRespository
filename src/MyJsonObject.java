import com.alibaba.fastjson.JSON;

import java.rmi.server.UID;

/**
 * Created by Administrator on 2017/9/14.
 */
public class MyJsonObject {
    public static void main(String[] args) {
//        List list= new ArrayList();
//        list.add("ssss");
//        list.get(2);
//        JSONObject jsonObject=new JSONObject();
//
//        jsonObject.put("333","999");
//        Collection col=jsonObject.values();
//        System.out.println(jsonObject);
//
//        System.out.println(list.get(1));
//        jsonObject.getJSONArray("");
        String a="123ppp";
        System.out.println(a.startsWith("123p",1));
//        与时间有关，唯一值
        UID id=new UID();
//        38943db3:15e83300383:-8000
//        27524199:15e833065a6:-8000
//        40be778a:15e8330cfa4:-8000
        System.out.println(id);
        JSON json =new JSON() {
            @Override
            public String toJSONString() {
                return super.toJSONString();
            }
        } ;

//        List<String> list=new ArrayList<String>();
//        list.
        int a1=5;
        int b;
        a1=b=9;
        System.out.println(a1+"----"+b);

    }
}
