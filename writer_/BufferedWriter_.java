package writer_;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) {
    }
    @Test
    public void fileRead01() throws IOException {
        //创建一个
        String filePath="e:\\Ok.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("hello word ,tomorrow");
        bufferedWriter.newLine();//插入一个换行符
        bufferedWriter.write("hello2 word ,tomorrow");
        bufferedWriter.newLine();//插入一个换行符
        bufferedWriter.write("hello3 word ,tomorrow");
        bufferedWriter.newLine();//插入一个换行符
        bufferedWriter.write("hello4 word ,tomorrow");
        bufferedWriter.newLine();//插入一个换行符


        bufferedWriter.close();

    }

}
