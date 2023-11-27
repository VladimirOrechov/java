package oop;
import java.time.LocalDate;

public class Animal {
    private String name;
    private String illness;  // болезнь
    private String ownerName;
    private LocalDate birthday;

    
    public Animal(String string, String string2, String string3, String string4){
    }

    public Animal(String name,String illness, String ownerName, LocalDate birthday){
        this.name = name;
        this.illness = illness;
        this.ownerName = ownerName;
        this.birthday = birthday;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
