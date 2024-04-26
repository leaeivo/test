package File_;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void mi(){
        String filePath="e:\\new.txt";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            } else  {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("该文件不存在");
        }
    }
    //判断目录是否存在,存在就删除
    //在Java编程中目录也被当成文件
    @Test
    public void m2(){
        String filePath="e:\\yd";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            } else  {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("该文件不存在");
        }

    }
    @Test
    public void m3(){
        String directoryPath="e:\\yd\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()){
            System.out.println("该目录已经存在");
        }else {
            if (file.mkdirs()){
                System.out.println("该目录创建成功");
            }
            else {
                System.out.println("创建失败");
            }
        }

    }

}
