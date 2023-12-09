package oop;

import java.time.LocalDate;

public class Cat extends Animal implements Speakble, Goable{

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
    @Override
    public void speak() {
        System.out.println("cat meow");
    }
    @Override
    public void run() {
        System.out.println("cat run");
    }
    @Override
    public double getRunSpeed() {
        return 5.5;
        }
    @Override
    public String getName() {
        return name;
    }
}