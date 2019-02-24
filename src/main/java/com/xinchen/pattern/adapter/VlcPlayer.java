package com.xinchen.pattern.adapter;

/**
 * @author xinchen
 * @version 1.0
 * @date 20/02/2019 16:33
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. file name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing...
    }
}
