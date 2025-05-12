package com.workintech.developers;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        System.out.println("Senior Developer is coding...");
        setSalary(getSalary() * 1.10);
    }
}
