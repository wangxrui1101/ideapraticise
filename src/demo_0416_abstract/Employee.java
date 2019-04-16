package demo_0416_abstract;

/*
    *@version:04-16_abstract
    *@author:minglang
 */

import java.time.LocalDate;

public class Employee extends Person{
    private  double salary;
    private LocalDate date;

    public Employee(String name, double salary,int year,int month,int day) {
        super(name);
        this.salary = salary;
        date=LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getDate() {
        return date;
    }
    public void getRaiseSalary(double bypercent){
        salary=salary+salary*bypercent/100;
    }
    public String getDescription(){
        return String.format("an employee with a salary of $%.2f",salary);

    }

}
