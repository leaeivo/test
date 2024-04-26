package File_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info(){
        File file = new File("e:\\new.txt");
        //调用相应的方法
        System.out.println("文件名字="+file.getName());
        System.out.println("绝对路径="+file.getAbsolutePath());
        System.out.println("文件父级目录="+file.getParent());
        System.out.println("文件大小="+file.length());
        System.out.println("是否是文件："+file.isFile());
        System.out.println("是否是存在："+file.exists());
        System.out.println("是不是目录："+file.isDirectory());

    }
}
