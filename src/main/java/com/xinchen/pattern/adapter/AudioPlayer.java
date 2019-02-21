package com.xinchen.pattern.adapter;

/**
 * @author xinchen
 * @version 1.0
 * @date 20/02/2019 16:39
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // 内置类型
        if ("mp3".equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. file name: "+ fileName);
        }

        // 适配器提供的支持的其他类型
        else if ("vlc".equalsIgnoreCase(audioType)|| "mp4".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
