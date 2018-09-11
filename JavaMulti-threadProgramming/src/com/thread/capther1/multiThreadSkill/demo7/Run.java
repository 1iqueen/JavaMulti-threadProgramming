package com.thread.capther1.multiThreadSkill.demo7;

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
由A 计算,count:4
由E 计算,count:3
由D 计算,count:2
由B 计算,count:1
由C 计算,count:0

使用synchronized解决了线程占用的问题,
达到了count按顺序减少的效果.

syn可以在任意对象及方法上加锁,而加锁的这段代码称为"互斥区"或"临界区"
*/

