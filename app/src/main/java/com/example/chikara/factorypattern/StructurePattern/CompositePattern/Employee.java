package com.example.chikara.factorypattern.StructurePattern.CompositePattern;

/**
 * Created by chikara on 2/13/18.
 */

public interface Employee {
    void addEmployee(Employee employee);

    void removeEmployee(Employee employee);

    String getName();

    int getSalary();
}
