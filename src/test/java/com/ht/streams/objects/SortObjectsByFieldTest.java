package com.ht.streams.objects;

import com.ht.streams.models.Employee;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static com.ht.streams.objects.SortObjectsByField.sortByAge;
import static com.ht.streams.objects.SortObjectsByField.sortByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SortObjectsByFieldTest {

    @Test
    void testSortByAge() {
        List<Employee> employees = Arrays.asList(
                Employee.builder().name("Alice").age(30).build(),
                Employee.builder().name("Bob").age(25).build(),
                Employee.builder().name("Charlie").age(28).build()
        );

        List<Employee> expected = Arrays.asList(
                Employee.builder().name("Bob").age(25).build(),
                Employee.builder().name("Charlie").age(28).build(),
                Employee.builder().name("Alice").age(30).build()
        );

        List<Employee> result = sortByAge(employees);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).getName(), result.get(i).getName());
            assertEquals(expected.get(i).getAge(), result.get(i).getAge());
        }
    }

    @Test
    void testSortByName() {
        List<Employee> employees = Arrays.asList(
                Employee.builder().name("Alice").age(30).build(),
                Employee.builder().name("Bob").age(25).build(),
                Employee.builder().name("Charlie").age(28).build()

        );

        List<Employee> expected = Arrays.asList(
                Employee.builder().name("Alice").age(30).build(),
                Employee.builder().name("Bob").age(25).build(),
                Employee.builder().name("Charlie").age(28).build()
        );

        List<Employee> result = sortByName(employees);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).getName(), result.get(i).getName());
            assertEquals(expected.get(i).getAge(), result.get(i).getAge());
        }
    }
}
