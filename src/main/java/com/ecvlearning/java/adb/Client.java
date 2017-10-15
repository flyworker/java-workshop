package com.ecvlearning.java.adb;

public class Client {
    public static void main(String[] args){
//        TableIF table = new Table();
//        TableIF table = new TableLinked();

        TableIF table = TableFactory.createTable(args[0]);

        System.out.println("Initial size: "+table.size());

        table.add(); //add an empty row
        table.insert(Constants.ID,"1");
        table.insert(Constants.NAME,"Alex");

        System.out.println("Size: "+table.size());
        System.out.println(Constants.ID +":"+table.select(Constants.ID));
        System.out.println("NAME:"+table.select(Constants.NAME));

//        System.out.println("Get: "+table.get(0).select("NAME"));

        table.add(); //add an empty row
        table.insert(Constants.ID,"2");
        table.insert(Constants.NAME,"Maggie");

        System.out.println("Size: "+table.size());
        System.out.println("ID:"+table.select(Constants.ID));
        System.out.println("NAME:"+table.select(Constants.NAME));

        table.remove(0);
        System.out.println("Size: "+table.size());
        System.out.println("ID:"+table.select(Constants.ID));
        System.out.println("NAME:"+table.select(Constants.NAME));

        table.update(Constants.NAME,"Neo");
        System.out.println("Size: "+table.size());
        System.out.println("ID:"+table.select(Constants.ID));
        System.out.println("NAME:"+table.select(Constants.NAME));

        table.delete(Constants.NAME);
        System.out.println("Size: "+table.size());
        System.out.println("ID:"+table.select(Constants.ID));
        System.out.println("NAME:"+table.select(Constants.NAME));
    }

}
