package com.company;

import java.util.Date;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {


    public static void main(String[] args) throws InterruptedException {



        TimeoutQueue<String> tq = new TimeoutQueue<String>();
        tq.offer("artem", 100);
        Thread.sleep(100);
        tq.offer("oleg", 16);
        Thread.sleep(15);
        tq.offer("avit9", 100);
        tq.offer("kongo", 100);
        tq.offer("ritail", 100);

        System.out.println(tq.poll());







    }





}
