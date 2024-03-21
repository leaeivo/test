package Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapFor_ {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put("key","nsa8");
        map.put("key1","nsa7");
        map.put("key2","nsa6");
        map.put("key3","nsa5");
        map.put("key4","nsa4");
        map.put("key5","nsa3");
        map.put("key6","nsa2");
        map.put("key7","nsa1");
        map.put("key8","nsa0");
        System.out.println(map);

        Set keyset=map.keySet();
        //迭代器
        for (Object o :keyset) {
            System.out.println(o);
        }
        //增强for循环
        System.out.println("___________________");
        Iterator iterator =keyset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //通过EntrySet
        Set entryset=map.entrySet();
        for(Object entry:entryset){
            //将entry转成Map.entry
            Map.Entry m=(Map.Entry)entry;
            System.out.println(m.getKey()+"--"+m.getValue());

        }
        Iterator iterator1=entryset.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            Map.Entry m=(Map.Entry)next;
            System.out.println(m.getKey()+"--"+m.getValue());
        }


    }


}
