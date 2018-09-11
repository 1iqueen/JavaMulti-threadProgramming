package com.thread.capther3.threadsCommunication.demo3;

public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }


    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wait开始时间:" + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait结束时间:" + System.currentTimeMillis());
                }
            }

        } catch (InterruptedException e) {

        }

    }
}
