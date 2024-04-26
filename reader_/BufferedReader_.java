package reader_;

import org.junit.jupiter.api.Test;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) {

    }
    @Test
    public void ReadFile01() throws IOException {
        String filePath="e:\\note.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        //只需要关闭bufferedReader就可以了
        bufferedReader.close();

    }
}
