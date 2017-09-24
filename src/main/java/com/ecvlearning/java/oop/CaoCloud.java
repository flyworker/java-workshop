package com.ecvlearning.java.oop;

public class CaoCloud {
    CloudImpl c;

    public CaoCloud(String userName, String password){
        c = new CloudImpl(userName,password);
    }

    public boolean login(String userName, String password){
        return c.login(userName,password);
    }

    public void upload(String file){
        c.upload(file);
    }

    public String download(String file){
        return c.download(file);
    }

    public String fastDownload(String file){
        return c.fastDownload(file);
    }

    public static void main(String[] args){
        CaoCloud cc = new CaoCloud("Cao","123");
        cc.login("Cao","123");
        cc.upload("Bitcoin.txt");
        cc.download("Ehbit.txt");
        cc.download("Bitcoin.txt");
        cc.fastDownload("Bitcoin.txt");
    }
}
