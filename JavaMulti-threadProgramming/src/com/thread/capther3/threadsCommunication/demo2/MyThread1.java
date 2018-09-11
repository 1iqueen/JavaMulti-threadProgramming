package com.thread.capther3.threadsCommunication.demo2;

public class MyThread1 extends Thread {

    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock) {
                System.out.println("wait开始时间:" + System.currentTimeMillis());
                lock.wait();
                System.out.println("wait结束时间:" + System.currentTimeMillis());
            }

        } catch (InterruptedException e) {

        }
    }
}
