package OutputStream_;

import java.io.*;

public class ObjectOutStream_ {
    public static void main(String[] args) throws IOException {
        String filePath="e:\\data.dat";
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath));

        oos.writeInt(100);//Integer 实现了Serializable//
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(3.2);
        oos.writeUTF("tzhcesw");
        oos.writeObject(new Dog("旺财",12));

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