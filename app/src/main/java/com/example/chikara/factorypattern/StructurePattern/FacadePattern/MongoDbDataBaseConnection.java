package com.example.chikara.factorypattern.StructurePattern.FacadePattern;

import java.util.ArrayList;

/**
 * Created by chikara on 2/14/18.
 */

public class MongoDbDataBaseConnection implements CommenInterface {

    MongoDbDataBaseConnection connection;
    ArrayList<String> list = new ArrayList<>();

    @Override
    public void createConnection() {

    }

    @Override
    public void distroyConnection() {

    }


    public MongoDbDataBaseConnection getDataBaseConnection() {
        return connection;
    }

    public ArrayList<String> getResultArray(int number) {
        return null;
    }

    public void saveResult(String result) {
        list.add(result);
    }

}
