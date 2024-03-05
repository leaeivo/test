package Interface1;

import java.util.Arrays;

public class EmplyeeSortTest {
    public static void main(String[] args) {
        var staff=new Employee[3];
        staff[0]=new Employee("Harry Hacker",35000);
        staff[1]=new Employee("Har Hacker",75000);
        staff[2]=new Employee("Harr Hacker",30000);
        Arrays.sort(staff);
        for(Employee e:staff){
            System.out.println("name="+e.getName()+",salary="+e.getSalary());
        }
    }

}




