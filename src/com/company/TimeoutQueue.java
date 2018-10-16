package com.company;

import java.util.*;

public class TimeoutQueue<T> {
    LinkedList<TimeCl> list = new LinkedList<>();

    class TimeCl{
        T t;
        long timeCr = 0;
        long timeLife = 0;

        TimeCl(T t1, long timeCr1, long timeLife1){
            t = t1;
            timeCr = timeCr1;
            timeLife = timeLife1;
        }

        public T getT() {
            return t;
        }

        public long getTimeCr() {
            return timeCr;
        }

        public long getTimeLife() {
            return timeLife;
        }
    }

    void offer(T t, long millis){
        long timeCreate = new Date().getTime();
        list.add(new TimeCl(t, timeCreate, millis));
    }

    T poll(){

        ListIterator<TimeCl> iterator = list.listIterator();

        long currentTime = 0;
        TimeCl tmp = null;

        while(iterator.hasNext()){

             tmp = iterator.next();
             currentTime = new Date().getTime();

             if( (currentTime - tmp.getTimeCr()) < tmp.getTimeLife()){
                 return tmp.getT();
             }
             else{
                 iterator.remove();
             }

        }
        return null;
    }
}
