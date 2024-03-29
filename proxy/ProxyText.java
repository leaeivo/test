package proxy;
import java.lang.reflect.*;
import java.util.*;

public class ProxyText {
    public static void main(String[] args) {
        var elements=new Object[1000];
        for(int i=0;i<elements.length;i++){
            Integer value=i+1;
            var handler=new TraceHandler(value);
            Object proxy=Proxy.newProxyInstance(
                    ClassLoader.getSystemClassLoader(),
                    new Class[]{Comparable.class},handler);

            elements[i]=proxy;
        }
        Integer key=new Random().nextInt(elements.length)+1;
        int result=Arrays.binarySearch(elements,key);
        if(result>=0) System.out.println(elements[result]);
    }
}
class TraceHandler implements InvocationHandler{

    private Object target;
    public TraceHandler(Object t){
        target=t;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(target);
        System.out.println("."+ method.getName()+"(");
        if(args!=null){
            for(int i=0;i<args.length;i++) {
                System.out.println(args[i]);
                if(i<args.length-1) System.out.println(", ");
            }
        }
        System.out.println(")");
        return method.invoke(target,args);
    }
}
