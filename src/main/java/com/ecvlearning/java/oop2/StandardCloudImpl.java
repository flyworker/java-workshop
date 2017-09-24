package com.ecvlearning.java.oop2;

public class StandardCloudImpl implements Cloud{
    int size = 20;
    private CloudFile[] cfs = new CloudFile[size];
    int index = 0;
    private String userName;
    private String password;

    @Override
    public void login(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    @Override
    public void upload(CloudFile cf) {
        this.cfs[index] = cf;
        index++;
    }

    @Override
    public CloudFile download(String name) {
        for(int i=0;i<index;i++){
            if(name.equals(this.cfs[i].getName())){
                return this.cfs[i];
            }
        }

        return null;
    }

    public static void main(String[] args){
        Cloud c = new StandardCloudImpl();
        CloudFile cf = new CloudFile();
        cf.setName("canglaoshi.avi");
        c.upload(cf);
        System.out.println(c.download("asd"));
        System.out.println(c.download("canglaoshi.avi").getName());

    }
}
