package set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        //1.以Set接口的实现类 HashSet
        //2.set接口的实现类的对象，不能放重复的数据，可以添加一个null
        //3，set接口的数据是无序的
        //4.取出的顺序是固定的，虽然和存放顺序不一样
        Set set=new HashSet();
        set.add("john");
        set.add("john1");
        set.add("john2");
        set.add("john3");
        set.add("john4");
        set.add("john6");
        set.add("john7");
        set.add(null);
        set.add(null);
        System.out.println(set);

        //遍历方式迭代器
        Iterator iterator= set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //set不能用索引获取，也不能用普通的for循环
        for (Object o :set) {
            System.out.println(o);
        }

    }
}
