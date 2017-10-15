package com.ecvlearning.java.adb;

import java.util.ArrayList;
import java.util.List;

public class Table implements TableIF{
    List<RecordIF> list = new ArrayList<>();
    int index = -1;

    public Table(){
        System.out.println("I'm ArrayList table!");
    }

    public RecordIF get(int index){
        return list.get(index);
    }

    public int size(){
        return this.list.size();
    }

    public void remove(int index){
        this.list.remove(index);
        previous();
    }

    public void remove(){
        this.list.remove(this.index);
        previous();
    }

    public void add(){
        this.list.add(new Record());
        next();
    }

    public void insert(String name, String value){
        RecordIF record = this.getCurrentRecord(this.index);
        record.insert(name, value);
    }

    public Object select(String name){
        RecordIF record = this.getCurrentRecord(this.index);
        return record.select(name);
    }

    private void next(){
        this.index++;
    }

    private void previous(){
        this.index--;
    }

    public void update(String name, String value){
        RecordIF record = this.getCurrentRecord(this.index);
        record.update(name, value);
    }

    public void delete(String name){
        RecordIF record = this.getCurrentRecord(this.index);
        record.delete(name);
    }

    private RecordIF getCurrentRecord(int index){
        return this.list.get(index);
    }

}
