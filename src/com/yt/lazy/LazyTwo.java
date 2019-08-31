package com.yt.lazy;

/**
 * 懒汉式二 （线程安全,性能差）
 */
public class LazyTwo {
    private LazyTwo(){}

    private static LazyTwo lazyTwo;

    public static synchronized LazyTwo getInstance(){
        if (lazyTwo == null){
            lazyTwo = new LazyTwo();
        }
        return lazyTwo;
    }
}
