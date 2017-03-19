package org.concordia.workshop.course4;

/**
 * Created by caoc on 3/19/2017.
 */

/**
 * Thread A: Retrieve c.
 Thread B: Retrieve c.
 Thread A: Increment retrieved value; result is 1.
 Thread B: Decrement retrieved value; result is -1.
 Thread A: Store result in c; c is now 1.
 Thread B: Store result in c; c is now -1
 */
class Counter {
    private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }

}