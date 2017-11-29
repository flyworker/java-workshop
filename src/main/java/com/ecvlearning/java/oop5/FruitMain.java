package com.ecvlearning.java.oop5;

public class FruitMain {

    public static void main(String[] args) {
        Fruit apple = new Fruit("apple", 3.0, 0);
        Fruit orange = new Fruit("pear", 4.0, 0);

        double initBalance = 40;

        long maxBytes = Runtime.getRuntime().maxMemory();
        System.out.println("Max memory: " + maxBytes / 1024 / 1024 + "M");
        double applePrice = apple.getPrice();

        while (apple.getQuantity() <= initBalance / applePrice) {
            int appleQuantity = apple.getQuantity();
            System.out.println("------ Loop " + appleQuantity + "------");
            double balance = initBalance;
            balance -= applePrice * appleQuantity;
            double orangePrice = orange.getPrice();
            orange.setQuantity((int) (balance / orangePrice));

            System.out.println(apple);
            System.out.println(orange);
            System.out.println();

            apple.setQuantity(appleQuantity + 1);
        }
    }
}
