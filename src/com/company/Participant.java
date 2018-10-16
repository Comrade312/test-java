package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

public class Participant extends Person{
    private ArrayList<Festival> partFest= new ArrayList<Festival>();

    public void addPart(){
        String str = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        this.addPhone(str);
    }

}
