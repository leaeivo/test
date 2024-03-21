package Map_;

import java.util.Hashtable;
@SuppressWarnings({"all"})
public class HashTable_ {
    public static void main(String[] args) {
        Hashtable table=new Hashtable();
        table.put("jhon",100);//ok
        table.put("lucy",210);//ok
        table.put("luy",2110);//ok
        table.put("luy",21111);//替换
        System.out.println(table);
        //1.底层有数组Hashbable%Entry[] 大小为11
        //2.临界值 threshold 8=11*0.75
        //
    }

}
//存放的元素是键值对:即K-V
//hashtable的键和值都不能为null
//hashtable的使用方法和HashMap一样
//hashtable是线程安全的，hashMap是线程不安全的
