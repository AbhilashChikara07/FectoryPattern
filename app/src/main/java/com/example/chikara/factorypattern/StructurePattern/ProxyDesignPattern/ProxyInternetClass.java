package com.example.chikara.factorypattern.StructurePattern.ProxyDesignPattern;

import android.util.Log;

import java.util.ArrayList;

public class ProxyInternetClass implements Internet {

    ArrayList<String> deniedHostNameList = new ArrayList<>();

    ProxyInternetClass() {
        if (deniedHostNameList.size() == 0) {
            deniedHostNameList.add("youtube.com");
            deniedHostNameList.add("facebook.com");
            deniedHostNameList.add("whatsapp.com");
            deniedHostNameList.add("twitter.com");
        }
    }

    @Override
    public void connectTo(String hostName) throws Exception {

        if (deniedHostNameList.contains(hostName))
            throw new Exception("ACCESS DENIED");
        else
            Log.e("PROXY HOST NAME :- ", "" + hostName);

    }

}
