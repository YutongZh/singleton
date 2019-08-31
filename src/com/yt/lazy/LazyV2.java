package com.yt.lazy;

/**
 * 静态内部类（防止反射侵入）终极单例模式
 */
public class LazyV2 {
    /**
     * 防止反射侵入
     */
    private static boolean isInstance = false;
    private LazyV2(){
        synchronized (LazyV2.class){
            if (isInstance){
                isInstance = !isInstance;
            } else {
                throw new RuntimeException("此单例已被反射侵入");
            }
        }
    }

    public static class Sington{
        private final static LazyV2 INSTANCE = new LazyV2();
    }

    public LazyV2 getInstance(){
        return  Sington.INSTANCE;
    }

    /**
     * readResolve(）代替了从流中读取对象。这就确保了在序列化和反序列化的过程中没人可以创建新的实例。
     * @return
     */
    private Object readResolve() {
        return getInstance();
    }
}
