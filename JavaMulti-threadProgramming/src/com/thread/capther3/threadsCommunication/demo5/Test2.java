package com.thread.capther3.threadsCommunication.demo5;

public class Test2 {
    public static void main(String[] args) {
        try {
            MyThread mt = new MyThread();
            mt.start();
            mt.join();
            System.out.println("我想得到上面线程的value之后再执行");
        } catch (InterruptedException e) {

        }
    }
}
