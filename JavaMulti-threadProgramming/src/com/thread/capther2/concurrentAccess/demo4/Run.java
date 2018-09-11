package com.thread.capther2.concurrentAccess.demo4;

public class Run {
    public static void main(String[] args) {

        ObjectService os = new ObjectService();
        ThreadA ta = new ThreadA(os);
        ta.setName("a");
        ta.start();

        ThreadB tb = new ThreadB(os);
        tb.setName("b");
        tb.start();
    }
}


//使用使用了同步代码块,但是效率并没有提高