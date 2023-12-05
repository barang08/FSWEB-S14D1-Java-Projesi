package com.workintech.Employee;

public class JuniorDeveloper extends Employee{


    public JuniorDeveloper(String name, long id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        setSalary(32000);
        System.out.println(getName() + "Junior has starts to work...");
    }
}
