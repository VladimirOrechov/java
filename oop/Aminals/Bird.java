package oop.Aminals;

import java.time.LocalDate;

public class Bird extends Animal implements Flyable, Speakble, Goable{
    public Bird(){
        super();
    }
    public Bird(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
        }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void fly() {
       System.out.println(" speed fly 9.4");
    }
    @Override
    public void speak() {
        System.out.println(" speak chik chirik");
    }
    @Override
    public void run() {
        System.out.println(" speed run 1.1");
    }
    
}
