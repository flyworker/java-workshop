package org.ecvictor.workshop.course4;

/**
 * Created by caoc on 3/19/2017.
 */
public class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}
