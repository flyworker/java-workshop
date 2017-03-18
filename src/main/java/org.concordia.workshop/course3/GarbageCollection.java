package org.concordia.workshop.course3;

/**
 * Created by ccao on 3/18/17.
 */
public class GarbageCollection {
    public static void main(String s[]) throws Exception {

        Runtime rs = Runtime.getRuntime();
        System.out.println("Free memory in JVM before running test = " + rs.freeMemory() / 1024 / 1024 + "M");
        StringConcat.test();
        System.out.println("Free memory in JVM before Garbage Collection = " + rs.freeMemory() / 1024 / 1024 + "M");
        rs.gc();
        System.out.println("Free memory in JVM after Garbage Collection = " + rs.freeMemory() / 1024 / 1024 + "M");
    }
}
