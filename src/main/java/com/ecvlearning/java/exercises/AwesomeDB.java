package com.ecvlearning.java.exercises;

/**
 * Implement a table structure using the combination of List and Map,
 * The table must be able to hold multiple rows and multiple columns
 * please read through before solving this problem:
 *
 * Functional requirement:
 * 1. Feel free to make assumptions
 * 2. Provide a get(int index) method to retrieve one row of the table
 * 3. Provide a size() method to retrieve the total number of rows
 * 4. Provide a remove(int index) method to delete the specified row
 * 5. Provide a remove() method to delete the current row
 * 6. Provide an add() method to add a new empty row
 *
 * 7. Provide a select(String name) method to retrieve specific element within a row
 * 8. Provide an insert(String name, String value) method to add new item to the row
 * 9. Provide an update(String name, String value) method to modify the value by specified name in row
 * 10. Provide a delete(String name) method to delete value from the row
 *
 * 11. Feel free to add extra methods/Classes whenever necessary
 *
 * Non-functional requirement:
 * 1. Please use Interface/Abstract Class to properly design the system
 * 2. Please implement in two ways: one focuses on fast retrieval; another emphasizes fast insertion/update/removal
 * 3. Those two types of implementations should share same interfaces so that we can switch the underlying implementations with minimum effort(Optional)
 * 4. Always keep SOLID principle in mind (Optional)
 *
 * The main() method:
 * 1. We need a table with column names: Id(int),Name(String),Gender(String),Age(int),Description(String),DateCreated(?)
 * 2. We need the program has at least 5 rows of data to show CRUD functionality
 *
 * Hints:
 * 1. Put Map in List
 * 2. All methods defined in an interface
 * 3. Use Constants for columns names
 * 4. Write comments to explain core logic and make assumptions
 * 5. Feel free to add extra methods/Classes but keep the program as simple as possible
 * 6. Google and StackOverflow are your best friends
 */
public class AwesomeDB {
}
