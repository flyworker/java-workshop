package com.ecvlearning.java.oop;

public class SubCloudImpl extends CloudImpl {
    public SubCloudImpl(String userName, String password){
        //invoke superclass constructor
         super(userName,password);
    }

    @Override
    protected String fastDownload(String file) {
        System.out.println("Real Fast download!");
        super.download(file);
        return super.download(file);
    }

    public void advertise(){
        System.out.println("This is Elgoog CloudImpl! The best cloud around the world!");
    }

    public static void main(String[] args){
        AbstractCloud sc = new SubCloudImpl("abc","123");
//        sc.advertise();
        sc.login("abc","123");
        sc.upload("Great.txt");
        sc.download("bad.txt");
        sc.download("Great.txt");
//        sc.fastDownload("Great.txt");


    }
}
