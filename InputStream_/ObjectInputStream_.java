package InputStream_;

import java.io.*;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath="e:\\data.dat";
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filePath));
        //读取序列化的顺序和保存数据（序列化）的顺序一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog=ois.readObject();
        System.out.println(dog.getClass());
        System.out.println(dog);
        ois.close();

    }
}
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}