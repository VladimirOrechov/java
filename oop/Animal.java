package oop;
import java.time.LocalDate;

/*
 *  calss Animal
 */
public class Animal { 
    private String name;  
    private Illness illness; // болезнь
    private String ownerName;
    private LocalDate birthday;

    
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
 * поведение объекта
 */
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Illness getIllness() {
        return illness;
    }
    public char[] IllnessName() {
        return null;
    }
}
