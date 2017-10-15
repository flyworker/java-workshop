package com.ecvlearning.java.adb;

public class TableFactory {
    public static TableIF createTable(String tableType){
        if(Constants.TABLE.equals(tableType)){
            return new Table();
        }else if(Constants.TABLE_LINKED.equals(tableType)){
            return new TableLinked();
        }else{
            return null;
        }
    }
}
