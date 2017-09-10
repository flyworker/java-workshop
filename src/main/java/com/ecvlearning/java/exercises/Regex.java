package com.ecvlearning.java.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        // String to be scanned to find the pattern.
        String line = "JDK8u144k";
        String pattern = "\\d+";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        while (m.find( )) {
            System.out.println("Found value: " + m.group() );
        }

        line = line.replaceAll(pattern,".");
        System.out.println("After replacement " + line );
    }
}
