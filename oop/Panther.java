package oop;

import java.time.LocalDate;

public class Panther extends Animal{
    
    public Panther(){
        super();
    }
    public Panther(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }
}
