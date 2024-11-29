package com.patterns.adapter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AudioPlayerTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testPlayMp3() {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "test_song.mp3");
        assertEquals("Playing mp3 file. Name: test_song.mp3" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPlayVlcThroughAdapter() {
        AudioPlayer player = new AudioPlayer();
        player.play("wmv", "test_video.wmv");
        assertEquals("Playing wmv file. Name: test_video.wmv" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testPlayMp4ThroughAdapter() {
        AudioPlayer player = new AudioPlayer();
        player.play("mp4", "test_video.mp4");
        assertEquals("Playing mp4 file. Name: test_video.mp4" + System.lineSeparator(), outputStreamCaptor.toString());
    }

    @Test
    void testInvalidMediaFormat() {
        AudioPlayer player = new AudioPlayer();
        player.play("avi", "test_video.avi");
        assertEquals("Invalid media. avi format not supported" + System.lineSeparator(), outputStreamCaptor.toString());
    }
}