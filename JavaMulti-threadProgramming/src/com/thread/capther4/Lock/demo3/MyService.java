package com.thread.capther4.Lock.demo3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();//在condition.await()方法之前调用,获得同步监视器
            System.out.println("await()时间:" + System.currentTimeMillis());
            condition.await();

        } catch (InterruptedException e) {

        } finally {
            lock.unlock();
        }
    }

    public void Signal() {
        try {
            lock.lock();
            System.out.println("signal()时间:" + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}

