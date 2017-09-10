package com.ecvlearning.java.adb;

public interface AwesomeDB {
    public void next();

    public void pre();

    public void first();

    public void last();

    public Record get(int index);

    public int size();

    public void remove(int index);

    public void remove();

    public void add(boolean isAsyn);

    public Object select(String columnName);
    public void insert(String name, Object value);

    public void update(String columnName, String value);

    public void delete(String columnName);
}
