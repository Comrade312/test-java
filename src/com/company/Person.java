package com.company;

import java.io.Serializable;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person implements Serializable {
    private String name;
    private String surname;
    private String phoneNum;
    private Date birthday;

    public Person(){}

    public Person(String name1, String surname1, String pN){
        this.name = name1;
        this.surname = surname1;
        this.phoneNum = pN;
    }

    public void show(){
        System.out.println(this.name);
        System.out.println(this.surname);
    }

    public boolean addPhone(String num){
        Pattern pat = Pattern.compile("((80|\\+375)(29|44)\\d{7})");
        Matcher match = pat.matcher(num);
        return match.matches();
    }


}
