package com.ht.streams.objects;

import com.ht.streams.models.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                Employee.builder().name("Alice").dept("IT").build(),
                Employee.builder().name("Bob").dept("HR").build(),
                Employee.builder().name("Charlie").dept("IT").build(),
                Employee.builder().name("Duplicate").dept("Finance").build(),
                Employee.builder().name("Duplicate").dept("HR").build()
        );

        Map<String, List<Employee>> grouped =
                groupByDepartment(employees);

        grouped.forEach((dept, empList) -> {
            System.out.println(dept + " -> " + empList);
        });
    }

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {

        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));
    }
}
