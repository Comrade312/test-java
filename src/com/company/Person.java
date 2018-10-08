package com.company;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surname;

    public Person(){}

    public Person(String name1, String surname1){
        this.name = name1;
        this.surname = surname1;
    }

    public void show(){
        System.out.println(this.name);
        System.out.println(this.surname);
    }
}
