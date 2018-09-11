package com.thread.capther3.threadsCommunication.demo5;

public class Test {
    public static void main(String[] args) {

        MyThread mt = new MyThread();
        mt.start();
        System.out.println("我想得到上面线程的value之后再执行");

    }
}
