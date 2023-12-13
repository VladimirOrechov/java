package oop.Aminals;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable{
    
    public Fish(){
        super();
    }
    public Fish(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void sweem() {
        System.out.println(" speed sweem 7.6");
    }

}   
