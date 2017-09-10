package com.ecvlearning.java.adb;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class SyncRecord implements Record {
    private Map<String, Object> map = new Hashtable<>();

    public void put(String key, Object value){
        this.map.put(key,value);
    }

    public Object get(String key){
        return this.map.get(key);
    }

    public boolean containsKey(Object key){
        return this.map.containsKey(key);
    }

    public void remove(String key){
        this.map.remove(key);
    }
}
