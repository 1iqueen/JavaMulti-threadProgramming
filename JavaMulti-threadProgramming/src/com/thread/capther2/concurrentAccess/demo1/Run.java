package com.thread.capther2.concurrentAccess.demo1;

public class Run {
    public static void main(String[] args) {

        HasSelfPrivateNum hspn1 = new HasSelfPrivateNum();
        HasSelfPrivateNum hspn2 = new HasSelfPrivateNum();

        ThreadA ta = new ThreadA(hspn1);
        ThreadB tb = new ThreadB(hspn2);

        ta.start();
        tb.start();
    }
}

/*

a set over!
b set over!
b num =200
a num =100

创建了2个对象,也就是JVM创建了2个锁

*/
