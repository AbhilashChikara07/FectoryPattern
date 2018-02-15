package com.example.chikara.factorypattern.StructurePattern.CompositePattern;

import java.util.ArrayList;

/**
 * Created by chikara on 2/13/18.
 */

public class ManagerClass implements Employee {
    ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
