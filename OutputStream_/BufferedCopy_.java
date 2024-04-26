package OutputStream_;


import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        String filePath="e:\\image1.png";
        String filePath2="e:\\hsp.png";

        BufferedInputStream bufferedInputStream=null;
        BufferedOutputStream bufferedOutputStream=null;


        bufferedInputStream=new BufferedInputStream(new FileInputStream(filePath));
        bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(filePath2));

        byte[] buff=new byte[1024];
        int readLen=0;
        while ((readLen=bufferedInputStream.read(buff))!=-1){
            bufferedOutputStream.write(buff,0,readLen);

        }
        if (bufferedInputStream!=null) {
            bufferedInputStream.close();
        }
        if (bufferedOutputStream!=null) {
            bufferedOutputStream.close();
        }

    }
}
