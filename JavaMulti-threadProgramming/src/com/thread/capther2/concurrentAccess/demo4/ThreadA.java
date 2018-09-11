package com.thread.capther2.concurrentAccess.demo4;

public class ThreadA extends Thread {

    private ObjectService service;

    public ThreadA(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
