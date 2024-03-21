package Map_;

import java.util.Comparator;
import java.util.TreeMap;
@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap treeMap=new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                return ((String) o2).compareTo((String) o1);
                return ((String)o1).length()-((String)o2).length();
            }
        });
        treeMap.put("jack","杰5克");
        treeMap.put("jacksw1","杰4克");
        treeMap.put("jaasaack2","杰3克");
        treeMap.put("jasck3","杰1克");
        treeMap.put("jasxsck4","杰2克");

        System.out.println(treeMap);
    }
}
