package com.ht.streams.models;


import lombok.*;

/**
 * Employee class with name and age.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public  class Employee {
    private int id;
    private String name;
    private int age;

}