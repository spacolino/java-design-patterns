package com.patterns.examples;

import com.patterns.adapter.AudioPlayer;

public class AdapterPatternExample {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond_the_horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("wmv", "far_far_away.wmv");
        audioPlayer.play("avi", "hello_world.avi");
    }
}
