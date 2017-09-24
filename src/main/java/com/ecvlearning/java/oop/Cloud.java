package com.ecvlearning.java.oop;

public interface Cloud {
    public boolean login(String userName, String password);

    public void upload(String file);

    public String download(String file);


    public void listFiles();


}
