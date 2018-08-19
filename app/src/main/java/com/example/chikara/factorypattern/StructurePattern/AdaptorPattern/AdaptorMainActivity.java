package com.example.chikara.factorypattern.StructurePattern.AdaptorPattern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.R;


/*
* Adaptor design pattern is one of the structure design pattern.
* Structure pattern is used to define a class structure should be.
* Adaptor design pattern is one of the structure design pattern which
* used when two unrelated interface work together.
* */

public class AdaptorMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudioPlayerInterface audioPlayerInterface = new Mp3PlayerClass();
        audioPlayerInterface.playAudioFile("MP3-FILE");

        audioPlayerInterface = new AdaptorPlayerClass(new VlcPlayerClass());
        audioPlayerInterface.playAudioFile("VLC FILE");
    }

}
