package com.example.dwmtapp;

import android.media.SoundPool;
import android.util.Log;

import java.util.Random;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Metronome extends Handler{
    int max_num = 50;
    int min_num = 10;
    int metroCount;
    private Random random;
    private Boolean Run = true;

    int metroDelay = random.nextInt(max_num - min_num + 1) + min_num;

    //MetroSound.initSounds

    public void runMetronome() {

    }

    @Override
    public void publish(LogRecord record) {

    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}
