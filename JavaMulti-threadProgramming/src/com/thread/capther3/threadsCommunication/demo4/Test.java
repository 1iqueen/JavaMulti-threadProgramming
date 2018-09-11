package com.thread.capther3.threadsCommunication.demo4;

public class Test {
    public static void main(String[] args) {

        Object lock = new Object();
        TestMethodThead tt = new TestMethodThead(lock);
        tt.start();

        NotifyMethodThread nt = new NotifyMethodThread(lock);
        nt.start();

        synNotifyMethodThread st = new synNotifyMethodThread(lock);
        st.start();

    }
}

/*
    wait() 开始的线程名称:Thread-0
    notify() 开始的线程名称:Thread-2 1536543715315
    notify() 结束的线程名称:Thread-2 1536543719315
    notify() 开始的线程名称:Thread-1 1536543719315
    notify() 结束的线程名称:Thread-1 1536543723315
    wait() 结束的线程名称:Thread-0



*/
