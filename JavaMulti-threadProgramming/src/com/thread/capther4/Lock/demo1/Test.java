package com.thread.capther4.Lock.demo1;

public class Test {
    public static void main(String[] args) {
        MyService ms = new MyService();
        MyThread mt1 = new MyThread(ms);
        MyThread mt2 = new MyThread(ms);
        MyThread mt3 = new MyThread(ms);
        MyThread mt4 = new MyThread(ms);
        MyThread mt5 = new MyThread(ms);

        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();

    }
}
/*

        当前线程名字:Thread-0 1
        当前线程名字:Thread-0 2
        当前线程名字:Thread-0 3
        当前线程名字:Thread-0 4
        当前线程名字:Thread-0 5
        当前线程名字:Thread-3 1
        当前线程名字:Thread-3 2
        当前线程名字:Thread-3 3
        当前线程名字:Thread-3 4
        当前线程名字:Thread-3 5
        当前线程名字:Thread-1 1
        当前线程名字:Thread-1 2
        当前线程名字:Thread-1 3
        当前线程名字:Thread-1 4
        当前线程名字:Thread-1 5
        当前线程名字:Thread-4 1
        当前线程名字:Thread-4 2
        当前线程名字:Thread-4 3
        当前线程名字:Thread-4 4
        当前线程名字:Thread-4 5
        当前线程名字:Thread-2 1
        当前线程名字:Thread-2 2
        当前线程名字:Thread-2 3
        当前线程名字:Thread-2 4
        当前线程名字:Thread-2 5

*/
