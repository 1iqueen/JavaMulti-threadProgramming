package com.thread.capther2.concurrentAccess.demo2;

public class Test {

    public static void main(String[] args) {
        try {
            PublicVar pv = new PublicVar();
            ThreadA t = new ThreadA(pv);

            t.start();
            Thread.sleep(200);
            pv.getValue();

        } catch (InterruptedException e) {

        }
    }
}

/*

    getValue thread name:main username:B password:AA
    SetValue thread name:Thread-0 username:B password:BB


结果读取的数据并不一致,
出现脏读是因为public void getValue()方法并不是同步的,所以可以在任意时候进行调用,
解决办法当然是加上同步synchronized
*/

