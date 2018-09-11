package com.thread.capther4.Lock.demo2;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA ta = new ThreadA(myService);
        ta.setName("A");
        ta.start();

        ThreadAA taa = new ThreadAA(myService);
        taa.setName("AA");
        taa.start();

        ThreadB tb = new ThreadB(myService);
        tb.setName("B");
        tb.start();

        ThreadBB tbb = new ThreadBB(myService);
        tbb.setName("BB");
        tbb.start();
    }
}

/*
    methodA 开始-线程名称:A 开始时间:1536548341132
    methodA 结束-线程名称:A 结束时间:1536548346132
    methodA 开始-线程名称:AA 开始时间:1536548346132
    methodA 结束-线程名称:AA 结束时间:1536548351132
    methodB 开始-线程名称:B 开始时间:1536548351132
    methodB 结束-线程名称:B 结束时间:1536548356133
    methodB 开始-线程名称:BB 开始时间:1536548356133
    methodB 结束-线程名称:BB 结束时间:1536548361134

*/
