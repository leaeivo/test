package PrinttStream_;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("hi bingk");
        printWriter.close();

        PrintWriter printWriter1 = new PrintWriter(new FileWriter("e:\\f2.txt"));
        printWriter1.println("hi bingk");
        printWriter1.close();


    }
}
