package OutputStream_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
           * public FileOutputStream(String name,
                       boolean append)
                throws FileNotFoundException创建文件输出流以指定的名称写入文件。 如果第二个参数是true ，则字节将写入文件的末尾而不是开头。 创建一个新的FileDescriptor对象来表示此文件连接。
               首先，如果有一个安全管理员，它的checkWrite方法是以name作为参数来调用的。

               如果文件存在但是是一个目录而不是常规文件，不存在但不能创建，或者由于任何其他原因无法打开，那么抛出一个FileNotFoundException 。

               参数
               name - 与系统相关的文件名
               append - 如果是 true ，那么字节将被写入文件的末尾，而不是开头

           */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile() throws IOException {
        FileOutputStream fileOutputStream=null;
        String filePath="e:\\a.txt";

        try {
            fileOutputStream=new FileOutputStream(filePath,true);
//            //写入一个字节
//            fileOutputStream.write('A');
            //写入字符串
            String str="hello,world";
            fileOutputStream.write(str.getBytes());
            //这种创建流的方式，是覆盖创建方式 当写入内容时会覆盖原先的内容



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileOutputStream.close();
        }
    }
}
