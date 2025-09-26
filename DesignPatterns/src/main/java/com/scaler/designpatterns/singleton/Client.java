package com.scaler.designpatterns.singleton;

public class Client {
    public static void main(String[] args) {
        Runnable task = () -> {
            DatabaseConnection db = DatabaseConnection.getInstance();
            System.out.println(Thread.currentThread().getName() +" Got the instance of db "+db);
        };

        Thread thread1 = new Thread(task,"Thread-1");
        Thread thread2 = new Thread(task,"Thread-2");
        Thread thread3 = new Thread(task,"Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
