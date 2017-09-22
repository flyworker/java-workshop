package com.ecvlearning.java.oop;

public class Cloud {
//    String name;
//    int size;
//    String function;

    private String userName;
    private String password;

    Cloud(String userName, String password){
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

    boolean login(String userName, String password){
        if(userName.equals(this.userName) && password.equals(this.password)){
            this.isLogged = true;
            return true;
        }else{
            this.isLogged = false;
            return false;
        }
    }

    void upload(String file){
        if(this.isLogged) {
            System.out.println(file + " uploaded!");
        }else{
            System.out.println("Not logged in!");
        }
    }

    public static void main(String[] args){
        System.out.println("I'm a cloud!");


        Cloud c = new Cloud("abc","123");

        Cloud c1 = new Cloud("cba","456");

//        Cloud c2 = new Cloud();
//        c2.setUserName("abc");
//        c2.setPassword("123");

        boolean logged = c.login("abc","123");
        System.out.println(logged);

        c.upload("photo.jpg");

        boolean logged1 = c1.login("cba","456");
        System.out.println(logged1);

        c1.upload("photo1.jpg");
//        c.save("Transcript.docx");
    }
}
