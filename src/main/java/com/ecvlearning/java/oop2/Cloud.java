package com.ecvlearning.java.oop2;

public interface Cloud {
    public void login(String userName, String password);
    public void upload(CloudFile cf);
    public CloudFile download(String name);

}
