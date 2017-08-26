package org.ecvictor.workshop.course5.interfaceExample;

import org.ecvictor.workshop.course5.overloading_overriding.Dog;

/**
 * Created by ccao on 2017-08-26.
 */
public class Hound extends Dog {
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
