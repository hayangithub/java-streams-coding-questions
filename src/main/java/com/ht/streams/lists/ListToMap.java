package com.ht.streams.lists;

import com.ht.streams.models.Employee;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Problem: Convert a list of objects into a Map using Java Streams.
 *
 * Approach:
 * 1. Use stream() on the list.
 * 2. Use Collectors.toMap() with key and value mapping functions.
 * 3. Optionally handle duplicate keys using a merge function.
 *
 * Example:
 * Input: List of Employees (id, name)
 * Output: Map<Integer, String> where key = id, value = name
 *
 * Complexity:
 * - Time: O(n)
 * - Space: O(n)
 */
public class ListToMap {
    /**
     * Converts a list of employees into a Map with id as key and name as value.
     *
     * @param employees list of Employee objects
     * @return map of id -> name
     */
    public static Map<Integer, String> convertListToMap(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getName,
                        (existing, replacement) -> existing, // keep first if duplicate id
                        LinkedHashMap::new // preserve insertion order
                ));
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                Employee.builder().name("Alice").id(1).build(),
                Employee.builder().name("Bob").id(2).build(),
                Employee.builder().name("Charlie").id(3).build(),
                Employee.builder().name("Duplicate").id(2).build() // Duplicate ID example
        );

        Map<Integer, String> employeeMap = convertListToMap(employees);

        System.out.println("Converted Map: " + employeeMap);
    }
}
