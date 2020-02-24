package me.seungui.ch04;

public class Employee implements Cloneable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public final String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return getClass().getName() + "[name=" + name
            + ",salary=" + salary + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
