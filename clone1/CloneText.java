package clone1;

public class CloneText {

    public static void main(String[] args)throws CloneNotSupportedException {
        var original=new Employee("John Q.Public",5000);
        original.setHireDay(2000,1,1);
        Employee copy=original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2012,12,31);
        System.out.println("original="+original.toSring());
        System.out.println("copy="+copy.toSring());

    }
}
