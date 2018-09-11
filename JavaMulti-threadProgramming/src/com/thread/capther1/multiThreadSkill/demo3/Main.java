package com.thread.capther1.multiThreadSkill.demo3;

public class Main {
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
        System.out.println("运行结束...");

    }
}


/*
    public Thread(Runnable target) {}
    单独的runnable方法是无法执行的,需要将runnable目标放在Thread对象中执行...


    target也可以传入一个Thread类对象
*/
