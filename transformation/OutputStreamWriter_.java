package transformation;

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath="e:\\hsp.txt";
        String charSet="utf-8";
        OutputStreamWriter osk = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osk.write("tzy 早上好");
        osk.close();
        System.out.println("按照"+charSet+"保存");

    }
}
