package com.thread.capther2.concurrentAccess.demo3;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        Service s = new Service();
        s.service1();
    }



    public static void main(String[] args) {

        MyThread m = new MyThread();
        m.start();
    }
}

/*
service1
service2
service3

可重入锁的概念是:自己可以再次获取自己的内部锁
*/

