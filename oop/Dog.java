package oop;

import java.time.LocalDate;

public class Dog extends Animal implements Speakble, Goable{
    public Dog(){
        super();
    }
    public Dog(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }
    public void setName(){
        System.out.println("Dog max");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void run() {
        System.out.println(" speed run 9.5");
    }
    @Override
    public void speak() {
        System.out.println(" speek gav");
    }
    public void Goable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'speak'");
    }
    
}