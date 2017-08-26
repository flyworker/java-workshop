package org.ecvictor.workshop.course5.abstractExample;

/**
 * Created by ccao on 2017-08-26.
 */
public class Hound extends AbstractDog {
    //overriding
    public void bark() {

        System.out.println("bowl");
    }

    //overloading
    public void bark(int num) {
        while (num-- > 0)
            System.out.println("bowl");
    }
}
