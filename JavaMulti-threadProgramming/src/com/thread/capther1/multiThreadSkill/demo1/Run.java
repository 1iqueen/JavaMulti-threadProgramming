package com.thread.capther1.multiThreadSkill.demo1;

public class Run {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        System.out.println("线程结束");
    }
}

/*
线程结束
MyThread.run

这里可以看出,
在使用多线程技术时,代码的运行结果与代码执行顺序或调用顺序是无关的
*/
