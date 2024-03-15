package collection;

import java.util.ArrayList;
import java.util.List;

public class ColletionMethod {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("jack");
        list.add(10);

//        list.remove(1);
//        list.remove("jack");
//        System.out.println("list="+list);
//
        System.out.println(list.size());

        System.out.println(list.isEmpty());

        list.clear();

        System.out.println(list);
        ArrayList list1=new ArrayList();
        list1.add("sanguo");
        list1.add("san");

        list.addAll(list1);

        System.out.println(list);

        System.out.println(list.containsAll(list1));

        list.removeAll(list1);
        System.out.println(list);



    }
}
