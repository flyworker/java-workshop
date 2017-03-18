package org.concordia.workshop.course3.interfaceSample.DoIt;

/**
 * Created by ccao on 3/18/17.
 */
public interface DoIt {

    void doSomething(int i, double x);
    int doSomethingElse(String s);
    boolean didItWork(int i, double x, String s);
//    default boolean didItWork(int i, double x, String s) {
        // Method body
//    }
}
