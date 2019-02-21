package com.xinchen.pattern.adapter;

/**
 * @author xinchen
 * @version 1.0
 * @date 20/02/2019 16:47
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","hello.mp3");
        audioPlayer.play("mp4","hello.mp4");
        audioPlayer.play("vlc","hello.vlc");
        audioPlayer.play("avi","hello.avi");
    }
}
