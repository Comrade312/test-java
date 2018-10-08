package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {
        /*ArrayList<Person> pList = new ArrayList<Person>();
        ArrayList l = new ArrayList();
        Person[] mas = new Person[3];
        mas[0] = new Person("A", "B");
        mas[1] = new Person("C", "D");
        mas[2] = new Person("E", "F");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("log1.sr");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream ous = null;
        try {
            ous = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Person p: mas) {
            pList.add(p);

        }

        ous.writeObject(pList);

        ous.close();

        pList = null;

        mas[0] = null;
        mas[1] = null;
        mas[2] = null;

        FileInputStream fis = new FileInputStream("log1.sr");

        ObjectInputStream ois = new ObjectInputStream(fis);

        pList = (ArrayList<Person>)ois.readObject();

        for (int i = 0; i < 3; i ++) {
            pList.get(i).show();
        }*/

        new SortFiles().sortFiles();







    }





}
