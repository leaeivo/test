package staticlnnerClass;

public class StaticlnnerClass {
    public static void main(String[] args) {
        var values=new double[20];
        for(int i=0;i<values.length;i++){
            values[i]=100*Math.random();
        }
        ArrayAlg.Pair p=ArrayAlg.Pair.minmax(values);
        System.out.println("min="+p.getFirst());
        System.out.println("max="+p.getSecond());

    }
}
class ArrayAlg{
    public static class Pair{
        private double first;
        private double second;
        public Pair(double f,double s){
            first=f;
            second=s;
        }
        public double getFirst(){
            return first;
        }
        public double getSecond(){
            return second;
        }
        public static Pair minmax(double[] values){
            double min=Double.POSITIVE_INFINITY;
            double max=Double.NEGATIVE_INFINITY;
            for(double v:values){
                if(min>v)min=v;
                if(max<v)max=v;
            }
            return new Pair(min,max);
        }
    }
}
