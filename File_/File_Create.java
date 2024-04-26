package File_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

//演示创建文件
public class File_Create {
    public static void main(String[] args) {
        //方式1


    }
    @Test
    public void create01() {
        String filePath="e:\\new.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void create02(){
        File file = new File("e:\\");
        String filePath="news2.txt";
        File file1 = new File(file, filePath);

        try {
            file1.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void create03(){
        String parentPath="e:\\";
        String filePath="news3.txt";
        File file = new File(parentPath, filePath);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
