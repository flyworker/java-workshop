package com.ecvlearning.java.adb;

public interface Record {
    public void put(String key, Object value);

    public Object get(String key);

    public boolean containsKey(Object key);

    public void remove(String key);
}
