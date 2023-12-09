package oop;
import java.time.LocalDate;

/*
 *  calss Animal
 */
public abstract class Animal { 
    private static final String Animal = null;
    protected String name;  
    protected Illness illness; // болезнь
    protected String ownerName;
    protected LocalDate birthday;

    
    public Animal(){
    }
/*
 * состояние объекта
 */
    public Animal(String name, Illness illness, String ownerName, LocalDate birthday){
        this.name = name;
        this.illness = illness;
        this.ownerName = ownerName;
        this.birthday = birthday;
    }
/*
 * поведение объекта /методы
 */
    public abstract String getName();

    public void setName(String name) {
    this.name = name;
}
    public Illness getIllness() {
        return illness;
    }
    public char[] IllnessName() {
        return null;
    }
    private void toWakeUp() {
        System.out.println(getClass().getSimpleName() + " Animal wake up");
    }

    private void eat() {
        System.out.println(getClass().getSimpleName() + " ate");
    }
    private void sleep() {
        System.out.println(getClass().getSimpleName() + " go to bed");
    }
    private void play() {
        System.out.println(getClass().getSimpleName() + " go to play");
    }
    private void breathe() {
        System.out.println(getClass().getSimpleName() + " breathe");
    }
    public void toGo () {
        System.out.println(getClass().getSimpleName() + " Wallk");
    }
    public void fly() {
        System.out.println(getClass().getSimpleName() +  " Fly");
    }
    public void sweem() {
        System.out.println(getClass().getSimpleName() + " Sweem");
    }
    public void liveCicle() {
        toWakeUp();
        eat();
        play();
        sleep();
        breathe();
        toGo();
        fly();
        sweem();
    }
    public void addPatietnt() {
    }
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", illness=" + illness + 
                ", ownername='" + ownerName + '\'' +
                ", birthday=" + birthday + 
                '}';
    }
}
