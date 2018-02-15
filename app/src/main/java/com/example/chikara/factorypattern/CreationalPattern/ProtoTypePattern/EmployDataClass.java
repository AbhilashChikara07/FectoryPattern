package com.example.chikara.factorypattern.CreationalPattern.ProtoTypePattern;

import java.util.ArrayList;

/**
 * Created by chikara on 2/13/18.
 */

public class EmployDataClass implements Cloneable {
    private ArrayList<String> empList;

    EmployDataClass(ArrayList<String> empList) {
        this.empList = empList;
    }

    public EmployDataClass() {
        empList = new ArrayList<>();
    }

    public ArrayList<String> getEmpList() {
        return empList;
    }

    public void loadData() {
        empList.add("Abhilash-1");
        empList.add("Abhilash-2");
        empList.add("Abhilash-3");
        empList.add("Abhilash-4");
        empList.add("Abhilash-5");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ArrayList<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new EmployDataClass(temp);
    }

    public EmployDataClass getObject() {
        ArrayList<String> mList = new ArrayList<>();
        for (String empData : getEmpList()) {
            mList.add(empData);
        }
        return new EmployDataClass(mList);
    }

}
