package com.example.demo2.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Person
{
    private int id; //Automatically generated by server | FE need not send this
    private String firstName; //should not be empty
    private String lastName; //can be empty
    private int dob; //mandatory
}
