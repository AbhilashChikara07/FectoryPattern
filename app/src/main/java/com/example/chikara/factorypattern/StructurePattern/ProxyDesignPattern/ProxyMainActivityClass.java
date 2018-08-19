package com.example.chikara.factorypattern.StructurePattern.ProxyDesignPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;

/*
 * Proxy design pattern is one of the structure design pattern.
 * AS the name suggest this pattern is mainly used for limited access.
 * */

public class ProxyMainActivityClass extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Internet internet = new ProxyInternetClass();
        try {
            internet.connectTo("youtube.com");
            internet.connectTo("fastFox.com");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
