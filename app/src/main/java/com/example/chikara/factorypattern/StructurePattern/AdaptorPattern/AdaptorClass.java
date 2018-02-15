package com.example.chikara.factorypattern.StructurePattern.AdaptorPattern;

import android.util.Log;

/**
 * Created by chikara on 2/13/18.
 */

public class AdaptorClass implements MediaPlayer {
    MediaPackage mediaPackage;

    public AdaptorClass(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void playMediaPlayer(String mediaPlayer) {
        Log.e("mediaPlayer", "" + mediaPlayer);
        mediaPackage.playMediaPackage(mediaPlayer);
    }
}
