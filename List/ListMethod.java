package List;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        //void add(int index,Object ele);在index位置插入
        list.add(1,"ttt");
        List list1=new ArrayList();
        list1.add("dwdw");
        list1.add("dw");
        list1.add("ddw");
        list1.add(1,"ddw");
        //boolean addAll(int index,Collection eles);
        //从index位置插入else的所有元素
        list.addAll(1,list1);
        System.out.println(list);

        //Object get(int index);获取指定位置的元素
        System.out.println(list.get(1));
        //int IndexOf(Object obj);返回obj在当前集合中首次出现的位置
        //int lastIndexOf(Object obj);返回obj在当前集合中末次出现的位置
        list.add("dwdw");
        System.out.println(list);

        System.out.println(list.indexOf("dwdw"));
        System.out.println(list.lastIndexOf("dwdw"));

//      Object remove(int index);删除指定位置元素，并替换
//        Object set(int index,Object ele);设定指定index位置的元素为ele，相当于替换
        list.set(3,"we");
        System.out.println(list);
        //list subList(int fromIndex,int toIndex);返回从fromIndex到toIndex位置的子集合
        List list2 = list.subList(0, 2);//前闭后开的
        System.out.println("list2="+list2);





    }
}
