package com.thread.capther3.threadsCommunication.demo3;

public class Test {
    public static void main(String[] args) {

        try {
            Object lock = new Object();

            ThreadA ta = new ThreadA(lock);
            ta.start();
            Thread.sleep(50);

            ThreadB tb = new ThreadB(lock);
            tb.start();

        } catch (InterruptedException e) {
        }
    }
}


/*

wait开始时间:1536312457291
        添加了1个元素
        添加了2个元素
        添加了3个元素
        添加了4个元素
        已发出通知!
        添加了5个元素
        添加了6个元素
        添加了7个元素
        添加了8个元素
        添加了9个元素
        添加了10个元素
wait结束时间:1536312467345


wait end在最后输出,说明notify()方法执行并不立即释放锁!!!
*/
