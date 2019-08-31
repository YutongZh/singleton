package com.yt.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册登录式（缓存容器式） （IOC）线程安全
 */
public class Register {
    private static Map<String, Object> register = new ConcurrentHashMap<String,Object>();

    public Object getBean(String className){
        synchronized (Register.class){
            if (!register.containsKey(className)){
                Object clazz = null;
                try{
                    clazz = Class.forName(className);
                    register.put(className, clazz);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return clazz;
            } else {
                return register.get(className);
            }
        }
    }
}
