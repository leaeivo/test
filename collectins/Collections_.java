package collectins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("tom");
        list.add("tom");
        list.add("tom");
        list.add("tom1");
        list.add("tom2");
        list.add("tom3");
        Collections.reverse(list);
        System.out.println(list);
        for(int i=0;i<5;i++){
            Collections.shuffle(list);
            System.out.println(list);
        }
        Collections.sort(list, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println(list);
        Object maxObject=Collections.max(list, new Comparator() {


            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        Object maxObject1=Collections.min(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println("Tom 的出现次数"+Collections.frequency(list,"tom"));

        ArrayList dest=new ArrayList();
        for (int i = 0; i < 6; i++) {
            dest.add("");
        }

        Collections.copy(dest,list);
        System.out.println(dest);

        Collections.replaceAll(list,"tom","jack");
        System.out.println(list);
    }

}
/* 提供了静态方法，对Set，list，map进行查询 删除 */
//reverse 倒转方法
//shuffle 随意打乱生成新的list，map，set
//sort 排序函数
//max and min
//frequency 频率
//copy 拷贝 为了完成一个完整的拷贝需要给dest赋值 大小和list.size()一样