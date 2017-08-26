package org.ecvictor.workshop.exercise5.abstractExample;

import org.ecvictor.workshop.exercise5.overloading_overriding.Dog;

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
