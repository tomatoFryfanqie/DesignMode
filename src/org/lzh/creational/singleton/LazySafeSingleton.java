package org.lzh.creational.singleton;

public class LazySafeSingleton {

    private static LazySafeSingleton instance;
    private LazySafeSingleton(){};
    public static synchronized LazySafeSingleton getInstance(){
        if (instance == null){
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
