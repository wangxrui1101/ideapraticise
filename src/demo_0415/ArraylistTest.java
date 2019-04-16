package demo_0415;

import java.util.ArrayList;

public class ArraylistTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff=new ArrayList<>();
        staff.add(new Employee("HAHA",1500,304,4,7));
        staff.add(new Employee("ruozhi",345,890,5,3));
        staff.add(new Employee("nvshengzuida",34,8000,5,3));

        for(Employee e:staff){
            e.raiseSalary(5);
        }
        for(Employee e:staff){
            System.out.println("name: "+e.getName() +"salary: "+e.getSalary() +"date: "+e.getDate());
        }


    }
}
