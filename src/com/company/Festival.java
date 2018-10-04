
package com.company;

import java.util.ArrayList;

public class Festival {
    private String name;
    private String type;
    private int numPlace;
    private ArrayList<Participant> partList = new ArrayList<Participant>();
    private ArrayList<Artist> artList = new ArrayList<Artist>();

    public void addTicket(Participant p) throws  ParticipantException{
        if(numPlace == 0) throw new ParticipantException();
        else{
            numPlace--;
            partList.add(p);
        }
    }

    public void menuPart(){
        try{
            addTicket(new Participant());
        }catch(ParticipantException ex){
            System.out.println("Места закончились");
        }

    }
}
