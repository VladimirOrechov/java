package oop;

import java.time.LocalDate;

public class Cat extends Animal{

    public Cat(){
        super();
    }
    public Cat(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }
    public void fly() {
        System.out.println(getClass().getSimpleName() +  " I Can not Fly");
    }
    public void sweem() {
        System.out.println(getClass().getSimpleName() + " I Dont like Sweem");
    }
}