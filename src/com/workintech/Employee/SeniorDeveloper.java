package com.workintech.Employee;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(String name, long id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        setSalary(55000);
        System.out.println(getName()+ "senior has starts to working...");
    }
}
