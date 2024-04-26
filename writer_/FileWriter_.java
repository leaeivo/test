package writer_;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {

    }
    @Test
    public void FileWriter01() throws IOException {
        String filePath="e:\\note.txt";
        FileWriter fileWriter=null;
        char[] chars={'a','b','c'};
        try {
            fileWriter=new FileWriter(filePath);
            //写入单个字符
            fileWriter.write('H');
            //写入指定数组
            fileWriter.write(chars);
            //写入字符数组
            fileWriter.write("tttyyyzzz".toCharArray(),0,4);
            //写入整个字符串
            fileWriter.write("hello word");
            //指定字符串的部分
            fileWriter.write("shangHai",0,2);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileWriter!=null){
                fileWriter.close();
            }
        }
    }
}
