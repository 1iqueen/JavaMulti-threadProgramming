package com.thread.capther3.threadsCommunication.demo4;

public class synNotifyMethodThread extends Thread {
    private Object lock;

    public synNotifyMethodThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);

    }
}
