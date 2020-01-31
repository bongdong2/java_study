package me.seungui.javainterface;

public class Employee implements Person, Identified, Comparable<Employee> {

    private int id;
    private String name;
    private Double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this.name = "";
        this.salary = salary;
    }

    public Employee(String name) {
        // salary automatically set to zero
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return Person.super.getId();
    }

    @Override
    public int compareTo(Employee other) {
        //return getId() - other.getId();
        //return this.name.compareTo(other.getName());
        //return Integer.compare(this.getId(), other.getId());
        return Double.compare(getSalary(), other.getSalary());
        //return Double.compare(other.getSalary(), getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
