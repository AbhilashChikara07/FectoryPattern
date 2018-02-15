package com.example.chikara.factorypattern.StructurePattern.FacadePattern;

import java.util.ArrayList;

/**
 * Created by chikara on 2/14/18.
 */

public class SqlDataBaseClass implements CommenInterface {

    SqlDataBaseClass sqlDataBaceClass;
    ArrayList<String> list = new ArrayList<>();

    @Override
    public void createConnection() {
        sqlDataBaceClass.createConnection();
    }

    @Override
    public void distroyConnection() {
        sqlDataBaceClass.distroyConnection();
    }


    public ArrayList<String> getResultArray(int number) {
        return null;
    }

    public void saveResult(String result) {
        list.add(result);
    }

}
