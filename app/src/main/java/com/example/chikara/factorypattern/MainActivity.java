package com.example.chikara.factorypattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.BehaviourPattern.MainClass;
import com.example.chikara.factorypattern.StructurePattern.AdaptorPattern.AdaptorMainActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, MainClass.class);
        startActivity(intent);

//        AudioPlayerInterface adaptorPlayerClass = new Mp3PlayerClass();
//        adaptorPlayerClass.playAudioFile("MP3 FILE");
//
//        adaptorPlayerClass = new AdaptorPlayerClass(new VlcPlayerClass());
//        adaptorPlayerClass.playAudioFile("VLC FILE");

    }

}
