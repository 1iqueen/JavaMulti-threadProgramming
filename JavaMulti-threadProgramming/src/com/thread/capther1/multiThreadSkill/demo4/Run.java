package com.thread.capther1.multiThreadSkill.demo4;

public class Run {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("A");
        MyThread mt2 = new MyThread("B");
        MyThread mt3 = new MyThread("C");

        mt1.start();
        mt2.start();
        mt3.start();
    }
}

/*

        由C 计算,count:4
        由B 计算,count:4
        由A 计算,count:4
        由A 计算,count:3
        由A 计算,count:2
        由B 计算,count:3
        由B 计算,count:2
        由B 计算,count:1
        由B 计算,count:0
        由C 计算,count:3
        由A 计算,count:1
        由A 计算,count:0
        由C 计算,count:2
        由C 计算,count:1
        由C 计算,count:0

每个线程独自计算各自的count变量,自己减少自己的count值

这里的变量不共享
不存在多线程访问同一个实例变量的情况

*/
