package pair2;

import java.io.Serializable;
import java.time.LocalDate;

public class Pair2Test {
    public static void main(String[] args) {
        LocalDate[] birthdays={
                LocalDate.of(1906,12,6),
                LocalDate.of(1815,12,10),
                LocalDate.of(1999,6,22),
                LocalDate.of(1299,6,22),

        };
        Pair<LocalDate> mm=ArrayAlg.minmax(birthdays);
        System.out.println("min="+mm.getFirst());
        System.out.println("max="+mm.getSecond());
    }
}
class ArrayAlg{
    public static<T extends Comparable>Pair<T>minmax(T[] a){
        if(a==null||a.length==0)return null;
        T min=a[0];
        T max=a[0];
        for(int i=1;i<a.length;i++){
            if(min.compareTo(a[i])>0)min=a[i];
            if(max.compareTo(a[i])<0)max=a[i];
        }
        return new Pair<>(min,max);
    }
}
class Pair<T>{
    private T first;
    private T second;
    public Pair(){
        first=null;second=null;
    }
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
