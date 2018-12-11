package com.homework.larry.minigameproject;

import android.util.Log;

public class MainThread extends Thread {
    private boolean running;

    public void setRunning(boolean r) {
        running = r;
    }

    @Override
    public void run() {
        long dem = 0L;
        super.run();
        while (running) {
            dem++;
            Log.d("testLoop:", "Loop" +dem);
        }
    }
}
