package PrinttStream_;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        //再默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
        PrintStream out=System.out;
        out.print("joo hello");
        //out.println();
        //print方法的底层是write
        out.write("tzy good morening".getBytes());
        out.close();

        //我们去修改打印流输出的位置
        System.setOut(new PrintStream("e:\\f1.txt"));
        System.out.println("hello word");

    }
}
