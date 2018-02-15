package com.example.chikara.factorypattern.StructurePattern.AdaptorPattern;

import android.util.Log;

/**
 * Created by chikara on 2/13/18.
 */

public class VlcClass implements MediaPackage{

    @Override
    public void playMediaPackage(String mediaPackage) {
        Log.e("Vlc class",""+mediaPackage);
    }
}
