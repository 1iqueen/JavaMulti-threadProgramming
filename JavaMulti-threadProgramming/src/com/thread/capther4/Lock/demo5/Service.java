package com.thread.capther4.Lock.demo5;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            lock.readLock().lock();
            System.out.println("获得锁的线程名称:" + Thread.currentThread().getName() + " 时间:" + System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        } finally {
            lock.readLock().unlock();
        }
    }
}
