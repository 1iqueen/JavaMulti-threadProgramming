package com.thread.capther3.threadsCommunication.demo4;

public class Service {
    public void testMethod(Object obj) {
        try {
            synchronized (obj) {
                System.out.println("wait() 开始的线程名称:"+Thread.currentThread().getName());
                obj.wait();
                System.out.println("wait() 结束的线程名称:"+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {

        }
    }

    public void synNotifyMethod(Object lock){
        try {
            synchronized (lock){
                System.out.println("notify() 开始的线程名称:"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
                lock.notify();
                Thread.sleep(4000);
                System.out.println("notify() 结束的线程名称:"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
            }
        }catch (InterruptedException e){

        }

    }
}
