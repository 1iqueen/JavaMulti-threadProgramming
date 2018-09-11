package com.thread.capther3.threadsCommunication.demo1;

public class Test {

    public static void main(String[] args) {

        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock) {
                System.out.println("syn里的第一行");
                lock.wait();
                System.out.println("wait下面的代码");
            }
            System.out.println("syn外面的代码");
        } catch (InterruptedException e) {

        }
    }
}

/*

    syn上面
    syn里的第一行


    程序走到这里就不走了,但是程序并没有退出!

*/


