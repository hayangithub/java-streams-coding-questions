package com.ht.streams.objects;

import com.ht.streams.models.Employee;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Problem: Sort a list of objects based on a specific field using Java Streams.
 *
 * Approach:
 * 1. Use stream() on the list.
 * 2. Use sorted() with Comparator.comparing() for the desired field.
 * 3. Collect back to a List.
 *
 * Example:
 * Input: List of Employees (name, age)
 * Sort by age ascending
 *
 * Complexity:
 * - Time: O(n log n) due to sorting
 * - Space: O(n) for the new list
 */
public class SortObjectsByField {

    /**
     * Sorts the list of employees by age in ascending order.
     *
     * @param employees list of Employee objects
     * @return sorted list by age
     */
    public static List<Employee> sortByAge(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());
    }

    /**
     * Sorts the list of employees by name alphabetically.
     *
     * @param employees list of Employee objects
     * @return sorted list by name
     */
    public static List<Employee> sortByName(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                Employee.builder().name("Alice").age(30).build(),
                Employee.builder().name("Bob").age(25).build(),
                Employee.builder().name("Charlie").age(28).build()
        );

        System.out.println("Sort by Age: " + sortByAge(employees));
        System.out.println("Sort by Name: " + sortByName(employees));
    }
}
