package com.thread.capther3.threadsCommunication.demo5;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            int secondVaule = (int) (Math.random() * 1000);
            System.out.println(secondVaule);
            Thread.sleep(secondVaule);
        } catch (InterruptedException e) {

        }
    }
}