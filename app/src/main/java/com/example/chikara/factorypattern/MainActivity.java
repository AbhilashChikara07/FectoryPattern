package com.example.chikara.factorypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.chikara.factorypattern.StructurePattern.AdaptorPattern.AdaptorPlayerClass;
import com.example.chikara.factorypattern.StructurePattern.AdaptorPattern.AudioPlayerInterface;
import com.example.chikara.factorypattern.StructurePattern.AdaptorPattern.Mp3PlayerClass;
import com.example.chikara.factorypattern.StructurePattern.AdaptorPattern.VlcPlayerClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudioPlayerInterface adaptorPlayerClass = new Mp3PlayerClass();
        adaptorPlayerClass.playAudioFile("MP3 FILE");

        adaptorPlayerClass = new AdaptorPlayerClass(new VlcPlayerClass());
        adaptorPlayerClass.playAudioFile("VLC FILE");

    }

}
