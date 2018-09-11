package com.thread.capther4.Lock.demo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();


    public void testMethod() {
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("当前线程名字:" + Thread.currentThread().getName() + " " + (i + 1));
        }
        lock.unlock();

    }
}

