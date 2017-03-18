package org.concordia.workshop.course3;

/**
 * Created by ccao on 3/17/17.
 */

public class StringConcat {

    /**
     * Which one is good option for concatenation
     * If a is null, then a.concat(b) throws a NullPointerException but a+=b will treat the original value of a as if it were null. Furthermore, the concat() method only accepts String values while the + operator will silently
     * convert the argument to a String (using the toString() method for objects).
     * So the concat() method is more strict in what it accepts.The concat method should be faster.
     */
    public static void test() {

        int c1 = 0;

        long start1 = System.currentTimeMillis();

        String a = "a";

        String b = "b";

        for (int i = 0; i < 100000; i++) { //ten million times
            a = a.concat(b);
            c1 = i;
        }

        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();

        String a1 = "a";

        String b1 = "b";

        for (int i = 0; i < 100000; i++) { //ten million times
            a1 = a1 + b1;
            c1 = i;
        }

        long end2 = System.currentTimeMillis();




        long start3 = System.currentTimeMillis();

        String a3 = "a";

        String b3 = "b";
        StringBuilder sb = new StringBuilder();
        sb.append(a3);
        for (int i = 0; i < 100000; i++) { //ten million times
            a3=sb.append(b3).toString();
            c1 = i;
        }

        long end3 = System.currentTimeMillis();
        System.out.println("concat run " + (c1 + 1) + " times ,spend time  is :" + (end1 - start1));
        System.out.println("+ run " + (c1 + 1) + " times, spend time is  : " + (end2 - start2));
        System.out.println("StringBuilder run " + (c1 + 1) + " times, spend time is  : " + (end3 - start3));
//        Runtime rs = Runtime.getRuntime();
//        System.out.println("Free memory in JVM when running test = " + rs.freeMemory() / 1024 / 1024 + "M");
    }

    public static void main(String[] args) {
        test();
    }
}