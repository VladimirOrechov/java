package oop.Aminals;

import java.time.LocalDate;

public class Panther extends Animal implements Goable, Speakble{
    
    public Panther(){
        super();
    }
    public Panther(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void speak() {
        System.out.println("speak rrrr");;
    }
    @Override
    public void run() {
        System.out.println("speed run 15.2");
    }
}
