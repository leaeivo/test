package List;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        //list集合类中元素有序（即添加顺序和拿出顺序一样）
        List list=new ArrayList();
        list.add("jack");
        list.add("jack33");
        list.add("jack3");
        list.add("jack2");
        list.add("jack1");
        list.add("jack");
        System.out.println(list);
        //list集合支持索引取出


    }
}
