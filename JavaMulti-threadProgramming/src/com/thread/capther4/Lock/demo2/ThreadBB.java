package com.thread.capther4.Lock.demo2;

public class ThreadBB extends Thread {
    private MyService myService;

    public ThreadBB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {

        myService.methodB();
    }
}
