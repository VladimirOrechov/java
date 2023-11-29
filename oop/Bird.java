package oop;

import java.time.LocalDate;

public class Bird extends Animal{
    public Bird(){
        super();
    }
    public Bird(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
        }
}
