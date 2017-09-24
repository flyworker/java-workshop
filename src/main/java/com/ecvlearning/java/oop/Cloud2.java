package com.ecvlearning.java.oop;

public class Cloud2 implements Cloud,Backdoor {
    private String userName = "cloud2";
    private String password = "123";

    @Override
    public boolean login(String userName, String password) {
        return false;
    }

    @Override
    public void upload(String file) {

    }

    @Override
    public String download(String file) {
        return null;
    }

    @Override
    public void listFiles() {

    }

    @Override
    public String getPassword(String userName) {
        return this.password;
    }

    public static void main(String[] args){
        Cloud c = new Cloud2();

        Backdoor bd  = new Cloud2();
        String password = bd.getPassword("cloud2");
        System.out.println(password);
    }
}
