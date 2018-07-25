package com.example.chikara.factorypattern.StructurePattern.AdaptorPattern;

import android.util.Log;

public class AdaptorPlayerClass implements AudioPlayerInterface {

    VideoPlayerInterface videoPlayerInterface;

    public AdaptorPlayerClass() {
    }


    public AdaptorPlayerClass(VideoPlayerInterface videoPlayerInterface) {
        this.videoPlayerInterface = videoPlayerInterface;
    }


    @Override
    public void playAudioFile(String mFile) {

        if ("VLC FILE".equalsIgnoreCase(mFile)) {
            videoPlayerInterface.playVideoFile(mFile);
        } else if ("MP4".equalsIgnoreCase(mFile)) {
            videoPlayerInterface.playVideoFile(mFile);
        } else {
            Log.e("AdaptorPlayerClass :- ", "" + mFile);
        }

    }

}
