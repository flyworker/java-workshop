package com.ecvlearning.java.oop;

public abstract class AbstractCloud implements Cloud{

    int size = 10;
    String[] files = new String[size];

//    public abstract boolean login(String userName, String password);
//
//    public abstract void upload(String file);
//
//    public abstract String download(String file);
//
//    public abstract String fastDownload(String file);

    public void listFiles(){
        for(String fileName:this.files){
            System.out.println(fileName);
        }
    }
}
