package com.boczar.StringsCreatorApp.util;

public class ThreadsService extends Thread {

    public static void main(String[] args) {

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        t1.start();
        t2.start();
        t3.start();

        int i = Thread.activeCount() - 2; //why 2 ?
        System.out.println("Number of threads " + i);
    }
}
