package Map_;

import java.util.HashMap;
import java.util.Map;
@SuppressWarnings({"all"})
public class map_ {
    public static void main(String[] args) {
        //Map接口的实例化
        //1.map和collection并列存在，用于保存具有映射关系的数据，key-value(双列函数)
        Map map = new HashMap<>();
        map.put("no1", "hxy");
        map.put("no2", "sas");
        map.put("no1", "hxq");
        //map对于相同的key时，是覆盖掉之前的值
        map.put("ok1", "hxy");

        map.put(new Object(), "jfsw");
        System.out.println(map);
        //通过get方法，传入key，可以得到对应的value
        System.out.println(map.get("no2"));
        //map数据是存放在HashMap$Node里面，但首先是建立了一个set存放key的引用，一个collection存放value的引用
        //k-V为了方便程序员的遍历，回建立EntrySet集合，该集合存放的元素类型Entry，
        //EntrySet<Entry<k,y>>
        //1.put方法
        //2.get方法
        //3.remove 根据键删除映射关系
        //4.size 获取元素个数
        //5.isEmpty:判断个数是否为0
        //6.clear:清除
        //7.containsKey：查找key是否存在



    }
}