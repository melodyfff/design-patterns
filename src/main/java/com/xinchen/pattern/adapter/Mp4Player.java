package com.xinchen.pattern.adapter;

/**
 * @author xinchen
 * @version 1.0
 * @date 20/02/2019 16:35
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        // do nothing...
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. file name: "+ fileName);
    }
}
