package oop;


import java.time.LocalDate;

public class Fish2 extends Animal implements Swimable{
    
    public Fish2(){
        super();
    }
    public Fish2(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void sweem() {
        System.out.println(" speed sweem 4.6");
    }
}   