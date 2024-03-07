package clone1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
        hireDay=new Date();
    }

    public Employee clone() throws CloneNotSupportedException{
        Employee cloned=(Employee) super.clone();

        cloned.hireDay=(Date) hireDay.clone();

        return  cloned;
    }

    public void setHireDay(int year,int month,int day) {
        Date newHireday=new GregorianCalendar(year,month-1,day).getTime();

        hireDay.setTime(newHireday.getTime());
    }
    public void raiseSalary(double byPerent){
        double raise =salary*byPerent/100;
        salary+=raise;
    }
    public String toSring(){
        return "Employee[name+"+ name +" , salary="+salary+",hireDay="+hireDay+"]";
    }
}
