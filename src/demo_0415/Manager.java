package demo_0415;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double basesalary;
        basesalary=super.getSalary();
        bonus=bonus+basesalary;
        return bonus;

    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
