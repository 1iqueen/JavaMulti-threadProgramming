package com.thread.capther2.concurrentAccess.demo2;

public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(2000);
            this.password = password;
            System.out.println("SetValue thread name:" + Thread.currentThread().getName() + " username:" + username + " password:" + password);

        } catch (InterruptedException e) {

        }
    }

    public void getValue() {
        System.out.println("getValue thread name:" + Thread.currentThread().getName() + " username:" + username + " password:" + password);

    }
}
