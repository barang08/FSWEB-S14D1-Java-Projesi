package com.workintech.Employee;

public class MidDeveloper extends Employee{

    public MidDeveloper(String name, long id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        setSalary(40000);
        System.out.println(getName() + "mid dev starts to working...");
    }
}
