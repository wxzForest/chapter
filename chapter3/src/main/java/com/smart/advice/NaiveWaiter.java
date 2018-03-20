package com.smart.advice;

public class NaiveWaiter implements Waiter{

    public void greeTo(String name) {
        System.out.println("hello "+name);
    }

    public void serveTo(String name) {
        System.out.println("serve "+name);
    }
}
