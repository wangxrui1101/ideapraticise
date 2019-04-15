package demo_0415;

/*
    *@version:0415_用户自定义类的调用
    *@author:minglang
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff=new Employee[3];
        staff[0]=new Employee("zs",75000,2019,11,10);
        staff[1]=new Employee("ls",15000,2018,11,10);
        staff[2]=new Employee("wemz",55000,2013,11,10);

        for(Employee e:staff){
            e.raiseSalary(5);
        }

        for (Employee e:staff){
            System.out.println("name:  "+e.getName()+"  salary:  "+e.getSalary()+"  date:  "+e.getDate());
        }
    }
}
