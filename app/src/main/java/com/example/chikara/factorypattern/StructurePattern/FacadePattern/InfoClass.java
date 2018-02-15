package com.example.chikara.factorypattern.StructurePattern.FacadePattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;

/**
 * Created by chikara on 2/14/18.
 */

public class InfoClass extends AppCompatActivity {

    /*
    * This Pattern is used to make a easy way to get resources.
    * Like using operating system.
    * While using operating system you don't need to care about programming.
    *
    * In this i am making connection with two databases .
    * And each database class have define some function.
    * So in the main class you can get connection and no need to write any extra code.
    * I thing this pattern is basically used in when you making jar and library.
    * From library you directly call function.
    * */


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SqlDataBaseClass sqlDataBaseClass = new SqlDataBaseClass();
        sqlDataBaseClass.createConnection();
        sqlDataBaseClass.saveResult("Abhilash");
        sqlDataBaseClass.getResultArray(10);


        MongoDbDataBaseConnection mongoDbDataBaseConnection = new MongoDbDataBaseConnection();
        mongoDbDataBaseConnection.createConnection();
        mongoDbDataBaseConnection.saveResult("Abhilash");
        mongoDbDataBaseConnection.getResultArray(10);
    }
}
