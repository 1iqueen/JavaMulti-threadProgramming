package com.thread.capther3.threadsCommunication.demo2;

public class MyThread2 extends Thread {

    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {
            System.out.println("notify开始时间:" + System.currentTimeMillis());
            lock.notify();
            System.out.println("notify结束时间:" + System.currentTimeMillis());
        }

    }
}
