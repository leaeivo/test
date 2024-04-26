package InputStream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    //读取文件
    @Test
    public void readFile01() throws IOException {
        String filePath="e:\\news2.txt";
        int read_data=0;
        FileInputStream fileInputStream=null;
        try {
            //创建FileInputStream对象
            fileInputStream = new FileInputStream(filePath);
            //如果返回-1表示读取完毕
            while ((read_data=fileInputStream.read())!=-1){
                System.out.print((char) read_data);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流
            fileInputStream.close();
        }
    }
    @Test
    public void readFile02() throws IOException {
        String filePath="e:\\news2.txt";
        int read_data=0;
        //定义一个字节数组
        byte[] buf=new byte[8];
        int read_length=0;
        FileInputStream fileInputStream=null;
        try {
            //创建FileInputStream对象
            fileInputStream = new FileInputStream(filePath);
            //fileInputStream.read(buf) 返回实际读取的字节数 表示读取完毕

            while ((read_length=fileInputStream.read(buf))!=-1) {
                System.out.print(new String(buf,0, read_length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流
            fileInputStream.close();
        }
    }

}
