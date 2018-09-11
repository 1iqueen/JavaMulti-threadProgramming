package com.thread.capther4.Lock.demo6;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write() {
        try {
            lock.writeLock().lock();
            System.out.println("获得写锁的线程名称:" + Thread.currentThread().getName() + " 时间:" + System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        } finally {
            lock.writeLock().unlock();
        }
    }
}
