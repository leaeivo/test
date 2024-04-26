package Properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("D:\\Java_data\\tankgame\\Properties_\\mysql.properties"));
        String Line="";
        while ((Line= br.readLine())!=null){
           String[] spli= Line.split("=");
            System.out.println(spli[0]+"=="+spli[1]);

        }
        br.close();
    }
}
