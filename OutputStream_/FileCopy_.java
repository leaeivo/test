package OutputStream_;

import java.io.*;
import java.util.HashMap;

public class FileCopy_ {
    public static void main(String[] args) throws IOException {

        //完成文件拷贝
        String filePath="e:\\image1.png";
        String destFilePath="d:\\copy.png";
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;

        try {
            fileInputStream=new FileInputStream(filePath);
            fileOutputStream=new FileOutputStream(destFilePath);
            byte[] buff= new byte[1024];
            int readLen=0;
            while ((readLen=fileInputStream.read(buff))!=-1){
                fileOutputStream.write(buff,0,readLen);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileOutputStream!=null){
                fileOutputStream.close();
            }
            if (fileInputStream!=null){
                fileInputStream.close();
            }
        }
    }

}
