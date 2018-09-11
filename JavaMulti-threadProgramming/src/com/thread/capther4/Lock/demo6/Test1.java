package com.thread.capther4.Lock.demo6;

public class Test1 {
    public static void main(String[] args) {

        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();


    }
}

//获得写锁的线程名称:a 时间:1536630484205
//获得写锁的线程名称:b 时间:1536630485206
