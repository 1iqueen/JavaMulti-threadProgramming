package com.thread.capther4.Lock.demo3;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        MyService myService = new MyService();
        MyThread mt = new MyThread(myService);
        mt.start();
        Thread.sleep(2000);
        myService.Signal();
    }
}


/*
        await()时间:1536549383856
        signal()时间:1536549385856
*/
