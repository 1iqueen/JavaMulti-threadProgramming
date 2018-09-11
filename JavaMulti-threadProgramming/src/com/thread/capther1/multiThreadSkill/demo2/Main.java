package com.thread.capther1.multiThreadSkill.demo2;

import com.thread.capther1.multiThreadSkill.demo1.MyThread;

public class Main {
    public static void main(String[] args) {
        try {
            com.thread.capther1.multiThreadSkill.demo1.MyThread mt = new MyThread();
            mt.setName("myThread");
            mt.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("Main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {

        }
    }
}


/*
*
Main=main
Main=main
run=myThread
Main=main
run=myThread
Main=main
Main=main
run=myThread
run=myThread
run=myThread
Main=main
run=myThread
Main=main
run=myThread
Main=main
Main=main
Main=main
run=myThread
run=myThread
run=myThread

随机数的形式来使线程得到挂起的效果,从而表现出CPU执行哪个线程具有不确定性
* */