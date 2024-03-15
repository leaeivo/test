package collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add(new Book("sanguoyanyi","luogunzhong",10.1));
        col.add(new Book("sanguoy","luohong",102.1));
        col.add(new Book("sanganyi","luzhong",101.1));

        //利用迭代器遍历
        //1.先得到col对应的迭代器

        Iterator iterator=col.iterator();
//        while (iterator.hasNext()){
//            Object obj=iterator.next();
//            System.out.println(obj);
//        }

        //快速生成while循环 itit
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //3.当退出while循环后 这时iterator迭代器指向最后的元素
        //iterator.next();//NoSuchElementException
        //4.如果希望继续使用，要重置迭代器
        iterator= col.iterator();//重置
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            
        }


    }
}

class Book{
    private String name;
    private String auther;
    private double price;

    public Book(String name, String auther, double price) {
        this.name = name;
        this.auther = auther;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}