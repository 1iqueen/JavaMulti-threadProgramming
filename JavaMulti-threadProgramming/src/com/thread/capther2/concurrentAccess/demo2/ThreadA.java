package com.thread.capther2.concurrentAccess.demo2;

public class ThreadA extends Thread {
    private PublicVar pv;

    public ThreadA(PublicVar pv) {
        this.pv = pv;
    }

    @Override
    public void run() {
        super.run();
        pv.setValue("B", "BB");
    }
}
