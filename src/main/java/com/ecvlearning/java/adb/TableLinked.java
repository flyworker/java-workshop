package com.ecvlearning.java.adb;


import java.util.LinkedList;
import java.util.List;

public class TableLinked implements TableIF{
    List<RecordIF> list = new LinkedList<>();
    int index = -1;

    public TableLinked(){
        System.out.println("I'm LinkedList table!");
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
