package com.yt.hungry;

/**
 * 单例模式 饿汉式
 */
public class Hungry {
    /**
     * 构造方法私有化
     */
    private Hungry(){}

    /**
     * 实例化的变量引用私有化
     */
    private final static  Hungry hungry = new Hungry();

    /**
     * 获取实例的方法共有
     * @return
     */
    public static Hungry getInstance(){
        return hungry;
    }

    public void showHungry(){
        System.out.println("hello world!");
    }
}
