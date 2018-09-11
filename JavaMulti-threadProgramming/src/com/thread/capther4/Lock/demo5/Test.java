package com.thread.capther4.Lock.demo5;

public class Test {
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



/*       获得锁的线程名称:a 时间:1536629889020
         获得锁的线程名称:b 时间:1536629889020

         几乎同时获得读锁;
*/