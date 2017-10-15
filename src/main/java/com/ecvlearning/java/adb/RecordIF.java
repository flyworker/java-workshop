package com.ecvlearning.java.adb;

public interface RecordIF {
    public void insert(String name, String value);

    public Object select(String name);

    public void update(String name, String value);

    public void delete(String name);
}
