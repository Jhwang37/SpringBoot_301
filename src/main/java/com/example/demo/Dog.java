package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NotNull @Min(1)
    private long id;
    @NotNull @Min(1)@Max(10)
    private String name;
    @NotNull @Min(1)
    private int age;
}
