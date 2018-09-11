package com.thread.capther4.Lock.demo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();

    public void methodA() {
        try {
            lock.lock();
            System.out.println("methodA 开始-线程名称:" + Thread.currentThread().getName() + " 开始时间:" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA 结束-线程名称:" + Thread.currentThread().getName() + " 结束时间:" + System.currentTimeMillis());


        } catch (InterruptedException e) {

        } finally {
            lock.unlock();
        }
    }


    public void methodB() {
        try {
            lock.lock();
            System.out.println("methodB 开始-线程名称:" + Thread.currentThread().getName() + " 开始时间:" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB 结束-线程名称:" + Thread.currentThread().getName() + " 结束时间:" + System.currentTimeMillis());


        } catch (InterruptedException e) {

        } finally {
            lock.unlock();
        }
    }

}
