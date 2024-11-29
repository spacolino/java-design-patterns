package com.patterns.adapter;

public class AdvancedMediaPlayer {
    public void playWmv(String fileName) {
        System.out.println("Playing wmv file. Name: " + fileName);
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
