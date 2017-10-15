package com.ecvlearning.java.adb;

import java.util.HashMap;
import java.util.Map;

public class Record implements RecordIF{
    Map<String, Object> map = new HashMap<>();

    public void insert(String name, String value){
        this.saveOrUpdate(name, value);
    }

    public Object select(String name){
        return this.map.get(name);
    }

    public void update(String name, String value){
        this.saveOrUpdate(name, value);
    }

    public void delete(String name){
        this.map.remove(name);
    }

    private void saveOrUpdate(String name, String value){
        this.map.put(name, value);
    }
}
