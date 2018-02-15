package com.example.chikara.factorypattern.StructurePattern.CompositePattern;

/**
 * Created by chikara on 2/13/18.
 */

public class DeveloperClass implements Employee {

    private Integer salary;
    private String employeeName;

    public DeveloperClass(String employeeName, Integer salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void removeEmployee(Employee employee) {

    }

    @Override
    public String getName() {
        return employeeName;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
