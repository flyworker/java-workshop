package com.ecvlearning.java.adb;

import java.util.List;

public abstract class AbstractAwesomeDB implements AwesomeDB{
    protected List<Record> list;

    public void add(boolean isAsyn){
        if(isAsyn)
            this.list.add(new AsynRecord());
        else
            this.list.add(new SyncRecord());
    }
}
