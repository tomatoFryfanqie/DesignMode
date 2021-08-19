package org.lzh.creational.singleton;

public class LazyUnSafeSingleton {

    private static LazyUnSafeSingleton instance;
    private LazyUnSafeSingleton(){};
    public static LazyUnSafeSingleton getInstance(){
        if (instance == null){
            instance = new LazyUnSafeSingleton();
        }
        return instance;
    }

}
