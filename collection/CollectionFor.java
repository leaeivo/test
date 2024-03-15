package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add(new Book("sanguoyanyi","luogunzhong",10.1));
        col.add(new Book("sanguoy","luohong",102.1));
        col.add(new Book("sanganyi","luzhong",101.1));

        //快捷方式I


        for(Object book:col){
            System.out.println("Book="+book);
        }
        //增强for底层还是迭代器
    }
}
