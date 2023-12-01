package oop;

import java.time.LocalDate;

public class Dog extends Animal{

    public Dog(){
        super();
    }
    public Dog(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }
    public void fly() {
        System.out.println(getClass().getSimpleName() +  " I Can not Fly");
    }
}