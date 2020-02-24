package me.seungui.ch04;

import java.util.Objects;

public class ConcurrentWorker extends Worker {
    public void work() {
        Thread t = new Thread(super::work);
        t.start();
    }
}