package oop;

import java.time.LocalDate;

public class Dog extends Animal implements Speakble, Goable{
    public Dog(){
        super();
    }
    public Dog(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }
    public void fly() {
        System.out.println(getClass().getSimpleName() +  " I Can not Fly");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    @Override
    public void speak() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'speak'");
    }
    public void Goable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'speak'");
    }
    
}