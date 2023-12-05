package com.workintech.Employee;

public class Employee {

    private String name;
    private long id;
    private double salary;

    public Employee(String name, long id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    public void work(){
        System.out.println("Employee starts to working...");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
