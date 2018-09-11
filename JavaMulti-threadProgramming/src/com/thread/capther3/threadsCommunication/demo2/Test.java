package com.thread.capther3.threadsCommunication.demo2;

public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 m1 = new MyThread1(lock);

            m1.start();
            Thread.sleep(2000);
            MyThread2 m2 = new MyThread2(lock);
            m2.start();

        } catch (InterruptedException e) {

        }
    }
}


/*

        wait开始时间:1536310955451
        notify开始时间:1536310957452
        notify结束时间:1536310957452
        wait结束时间:1536310957453

2s后线程被notify通知唤醒;
*/
