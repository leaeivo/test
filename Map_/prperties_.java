package Map_;

import java.util.Properties;

@SuppressWarnings({"all"})
public class prperties_ {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.put("john",100);
        properties.put("lucy",100);
        properties.put("lic",100);
        properties.put("lic",80);
        //prperties 继承了HashTable
        //通过键值对存放数据
        System.out.println(properties);
        //得到方法
        System.out.println(properties.get("lucy"));
        //删除
        properties.remove("lic");
        System.out.println(properties);

        //改
        properties.put("lucy",10000);
        System.out.println(properties);

    }
}//剩下的用io流来讲