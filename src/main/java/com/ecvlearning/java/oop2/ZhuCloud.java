package com.ecvlearning.java.oop2;

import com.ecvlearning.java.oop.CloudImpl;

public class ZhuCloud {
    CloudImpl c;

    public ZhuCloud(String userName, String password){
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
        return this.download(file);
    }


    public static void main(String[] args){
        ZhuCloud cc = new ZhuCloud("Zhu","123");
        cc.login("Zhu","123");
        cc.upload("Bitcoin1.txt");
        cc.download("Ehbit1.txt");
        cc.download("Bitcoin1.txt");
    }
}
