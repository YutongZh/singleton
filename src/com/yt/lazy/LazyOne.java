package com.yt.lazy;

/**
 * 懒汉式一(线程不安全)
 */
public class LazyOne {

    private LazyOne(){}

    private static LazyOne lazyOne;

    public LazyOne getInstance() {
        if (lazyOne == null){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }
}
