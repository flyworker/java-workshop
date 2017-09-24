package com.ecvlearning.java.oop;

public class CloudImpl extends AbstractCloud{
//    String name;
    int size = 10;
    int index;
//    String function;

    static String design = "Elgoog";
    private String userName;
    private String password;




    public CloudImpl(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

//    void setUserName(String userName){
//        this.userName = userName;
//    }
//
//    void setPassword(String password){
//        this.password = password;
//    }

    private boolean isLogged = false;

    public boolean login(String userName, String password){
        if(userName.equals(this.userName) && password.equals(this.password)){
            this.isLogged = true;
            return true;
        }else{
            this.isLogged = false;
            return false;
        }
    }

    public void upload(String file){
        if(this.isLogged) {
            int currentIndex = this.isExist(file);
            if(currentIndex != -1){
                this.files[currentIndex] = file;
                System.out.println(file + " overwritten!");
                return;
            }

            this.files[index] = file;
            index++;
            System.out.println(file + " uploaded!");
        }else{
            System.out.println("Not logged in!");
        }
    }

    public String download(String file){
        if(this.isLogged) {
            if(this.isExist(file) != -1){
                System.out.println(file + " downloaded!");
                return file;
            }

            System.out.println("The file "+file+" does not exist!");
            return null;
        }else{
            System.out.println("Not logged in!");
            return null;
        }
    }

    protected String fastDownload(String file){
        System.out.println("Fast download!");
        return this.download(file);
    }

//    boolean isExist(String file){
//        for(String fileName:this.files){
//            if(file.equals(fileName)){
//                return true;
//            }
//        }
//
//        return false;
//    }

    /**
     * common logic
     * @param file
     * @return
     */
    private int isExist(String file){
        for(int  i= 0 ; i<this.files.length;i++){
            if(file.equals(this.files[i])){
                return i;
            }
        }

        return -1;
    }

    public static String getDesign(){
        System.out.println(CloudImpl.design);
        return design;
    }

    public static void main(String[] args){

        CloudImpl.getDesign();

        System.out.println("I'm a cloud!");

        CloudImpl c = new CloudImpl("abc","123");


        CloudImpl c1 = new CloudImpl("cba","456");


//        CloudImpl c2 = new CloudImpl();
//        c2.setUserName("abc");
//        c2.setPassword("123");

        boolean logged = c.login("abc","123");
        System.out.println(logged);

        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.upload("photo.jpg");
        c.download("Canglaoshi.avi");

        boolean logged1 = c1.login("cba","456");
        System.out.println(logged1);

        c1.upload("photo1.jpg");
//        c.save("Transcript.docx");
    }
}
