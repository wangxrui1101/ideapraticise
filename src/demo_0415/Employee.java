package demo_0415;

import java.time.LocalDate;

/*
    *@version:0415_用户自定义类
    *@author:minglang
 */

public class Employee {
    private String name;
    private double salary;
    private LocalDate date;

    public Employee(String name, double salary, int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        this.date = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getDate() {
        return date;
    }
    public void raiseSalary(double byPercent){
        double raise=salary+byPercent/100;
        salary=salary+raise;
        System.out.println("The raiseSalary is: "+salary);
    }
}
