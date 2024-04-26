package Properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        //加载配置文件
        properties.load(new FileReader("D:\\Java_data\\tankgame\\Properties_\\mysql.properties"));
        //把K-V显示
        properties.list(System.out);

        String ip =properties.getProperty("ip");
        String user =properties.getProperty("user");
        String pwd =properties.getProperty("pwd");
        System.out.println("ip ="+ip);
        System.out.println("用户名 ="+user);
        System.out.println("密码 ="+pwd);

        //创建
        Properties properties1 = new Properties();
        properties1.setProperty("charSet","utf-8");
        properties1.setProperty("user","tom");
        properties1.setProperty("pwd","abc111");//如果该文件没有key就是创建，有就是修改

        properties1.store(new FileOutputStream("D:\\Java_data\\tankgame\\Properties_\\mysql1.properties"),"helloword");
        System.out.println("success~");


    }
}
