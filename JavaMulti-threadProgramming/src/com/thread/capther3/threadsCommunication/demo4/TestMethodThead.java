package com.thread.capther3.threadsCommunication.demo4;

public class TestMethodThead extends Thread {
    private Object lock;

    public TestMethodThead(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
