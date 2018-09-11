package com.thread.capther1.multiThreadSkill.demo6;

public class MyThread extends Thread {
    private int count = 5;


    @Override
    synchronized public void run() {
        super.run();
        count--;

        System.out.println("由" + Thread.currentThread().getName() + " 计算,count:" + count);
    }
}
