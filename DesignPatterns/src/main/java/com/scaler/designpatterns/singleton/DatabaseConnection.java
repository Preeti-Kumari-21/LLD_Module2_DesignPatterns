package com.scaler.designpatterns.singleton;

import java.util.concurrent.locks.ReentrantLock;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;
    private static final ReentrantLock lock = new ReentrantLock();

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if(instance == null){
            lock.lock(); //aquire lock
            try{
                if(instance == null){
                    instance = new DatabaseConnection();
                }
            }
            finally{
                lock.unlock();
            }
        }
        return instance;
    }
}
