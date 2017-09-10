package com.ecvlearning.java.adb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AwesomeDBModImpl extends AbstractAwesomeDB {
    public AwesomeDBModImpl(){
        this.list = new LinkedList<>();
    }
    private int pointer = 0;

    public void next(){
        pointer++;
    }

    public void pre(){
        pointer--;
    }

    public void first(){
        this.pointer = 0;
    }

    public void last(){
        this.pointer = this.list.size()-1;
    }

    public Record get(int index){
        return this.list.get(index);
    }

    public int size(){
        return this.list.size();
    }

    public void remove(int index){
        this.list.remove(index);
    }

    public void remove(){
        this.list.remove(pointer);
    }

//    public void add(boolean isAsyn){
//        if(isAsyn)
//            this.list.add(new AsynRecord());
//        else
//            this.list.add(new SyncRecord());
//    }

    public Object select(String columnName){
        return this.get(pointer).get(columnName);
    }

    public void insert(String name, Object value){
        if(this.list.size()-1 < this.pointer){
            this.add(true);
        }
        Record record = this.get(pointer);
        record.put(name,value);
    }

    public void update(String columnName, String value){
        Record record = this.get(pointer);
        if(record.containsKey(columnName)) {
            record.put(columnName, value);
        }else{
            System.out.println("Column name "+columnName+" does not exist!");
        }
    }

    public void delete(String columnName){
        Record record = this.get(pointer);
        if(record.containsKey(columnName)) {
            record.remove(columnName);
        }else{
            System.out.println("Column name "+columnName+" does not exist!");
        }
    }
}
