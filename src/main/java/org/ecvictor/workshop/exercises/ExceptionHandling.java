package org.ecvictor.workshop.exercises;

/**
 * Create a method which throws a checked exception
 * Create the second method which throws a runtime exception
 * Call those two methods in main
 * Print "I have an exception but I'm too lazy to deal with it." when unchecked exception occurs
 *
 * The main method must also print "I know what I'm doing" regardless how the whole programme executes(finally block)
 * Move all the code to a method with return value, investigate what is the execution order of code blocks - try,catch,finally and return
 *
 */
public class ExceptionHandling {

    public static void main(String args[]){
        //this clause cannot be removed but can be moved
        System.exit(1);
    }
}
