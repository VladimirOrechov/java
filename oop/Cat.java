package oop;

import java.time.LocalDate;

public class Cat extends Animal implements Speakble, Goable{

    public char[] getRunSpeed;
    public Cat(){
        super();
    }
    public Cat(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }
    @Override
    public void speak() {
        System.out.println("cat meow");
    }
    public void run(){
        System.out.println("cat run");
    }
    @Override
    public double getRunSpeed() {
        return 7.3;
        }
    @Override
    public String getName() {
        return name;
    }
}