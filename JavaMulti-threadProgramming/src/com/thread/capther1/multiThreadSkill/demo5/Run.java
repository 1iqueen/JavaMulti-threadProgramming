package com.thread.capther1.multiThreadSkill.demo5;

public class Run {
    public static void main(String[] args) {

        MyThread m = new MyThread();
        Thread a = new Thread(m, "A");
        Thread b = new Thread(m, "B");
        Thread c = new Thread(m, "C");
        Thread d = new Thread(m, "D");
        Thread e = new Thread(m, "E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}

/*
由B 计算,count:3
由A 计算,count:0
由D 计算,count:1
由E 计算,count:3
由C 计算,count:2

从结果中可以看出有两个线程打印了同一个值,
产生了"非线程安全问题"


    public Thread(Runnable target, String name) {
        init(null, target, name, 0);
    }
Thread类有这个一个构造方法
可以同享一个runnable对象
*/

