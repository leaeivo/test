package set_;

import java.util.HashSet;
import java.util.Set;

public class Hashset_ {
    public static void main(String[] args) {
        Set hashset=new HashSet();
        hashset.add(null);
        hashset.add(null);
        System.out.println(hashset);
        hashset=new HashSet<>();
        hashset.add("lcky");//添加成功
        hashset.add("lcky");//false
        hashset.add(new Dog("tom"));//true
        hashset.add(new Dog("tom"));//true
        System.out.println(hashset);

        //String类是不可变的，也就是final值，所有哪怕new String()最终的数据也是放在常量池里面吗
        //如果你用StringBulider 就会出现在堆里面
        hashset.add(new StringBuilder("hsp"));//true
        hashset.add(new String("hsp"));//false
        System.out.println(hashset);


    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
