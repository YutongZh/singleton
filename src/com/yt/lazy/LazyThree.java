package com.yt.lazy;

/**
 * 双检锁 （线程安全，性能高）
 */
public class LazyThree {
    private volatile static LazyThree lazyThree;

    private LazyThree(){}

    public LazyThree getInstance(){
        if (lazyThree == null) {
            synchronized (LazyThree.class){
                if (lazyThree == null){
                    lazyThree = new LazyThree();
                }
            }
        }
        return lazyThree;
    }
}
