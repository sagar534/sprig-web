package com0.jefferson.springweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@ToString
public class Customer {

    @Id
    public String id;
    public String firstName;
    public String lastName;
    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
