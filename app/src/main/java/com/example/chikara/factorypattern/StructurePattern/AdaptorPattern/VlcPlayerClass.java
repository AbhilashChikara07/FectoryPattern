package com.example.chikara.factorypattern.StructurePattern.AdaptorPattern;

import android.util.Log;

public class VlcPlayerClass implements VideoPlayerInterface {


    @Override
    public void playVideoFile(String mFile) {
        Log.e("VlcPlayerClass :- ", "" + mFile);
    }

}
