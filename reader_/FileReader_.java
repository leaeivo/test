package reader_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) throws IOException {

    }
    @Test
    public void FileRead01() throws IOException {
        String filePath="e:\\a.txt";
        FileReader fileReader=null;
        int data=0;
        try {
            fileReader=new FileReader(filePath);
            //循环读取
            while ((data=fileReader.read())!=-1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader!=null){
                fileReader.close();
            }
        }
    }
    @Test
    //用字符数组读取
    public void FileRead02() throws IOException {
        String filePath="e:\\a.txt";
        FileReader fileReader=null;
        int data=0;
        int readLen=0;
        char[] buff=new char[8];
        try {
            fileReader=new FileReader(filePath);
            //循环读取
            while ((readLen=fileReader.read(buff))!=-1){
                System.out.print(new String(buff,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader!=null){
                fileReader.close();
            }
        }
    }
}
