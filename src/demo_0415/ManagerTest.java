package demo_0415;

/*
    *@version:04_16_extends
    *@author:minglang
 */

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss=new Manager("sunshine",9000,2019,8,9);
        boss.setBonus(5000);
        Employee[] staff=new Employee[3];
        staff[0]=boss;
        staff[1]=new Employee("ming",890,2019,8,5);
        staff[2]=new Employee("lang",1900,209,6,15);
        for(Employee e:staff){
            System.out.println("NAME: "+e.getName()+" salary: "+e.getSalary()+" date "+e.getDate());
        }


    }
}
