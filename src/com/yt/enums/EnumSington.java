package com.yt.enums;

/**
 * 枚举式单例 避免反射 和 反序列化问题
 */
public enum EnumSington {

    INSTANCE;

    private Object value;

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public static EnumSington getInstance(){
        return INSTANCE;
    }
}

