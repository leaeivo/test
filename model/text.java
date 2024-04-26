package model;

public class text {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader = new BufferedReader_(new FileReader_());
        bufferedReader.readFiles(10);
        BufferedReader_ bufferedReader1=new BufferedReader_(new StringReader_());
        bufferedReader1.readString(10);
    }
}
