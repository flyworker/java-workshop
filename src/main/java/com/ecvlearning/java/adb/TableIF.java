package com.ecvlearning.java.adb;

public interface TableIF {
    public RecordIF get(int index);

    public int size();

    public void remove(int index);

    public void remove();

    public void add();

    public void insert(String name, String value);

    public Object select(String name);

    public void update(String name, String value);

    public void delete(String name);

}
