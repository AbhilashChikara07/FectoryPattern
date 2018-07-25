package com.example.chikara.factorypattern.StructurePattern.AdaptorPattern;

import android.util.Log;

public class Mp3PlayerClass implements AudioPlayerInterface {


    @Override
    public void playAudioFile(String mFile) {
        Log.e("Mp3PlayerClass :- ", "" + mFile);
    }

}
