package oop.Aminals;

public class Illness {
    public String illnessName;

public Illness(String illnessName){
    this.illnessName = illnessName;
    }
public void heal(){
    System.out.println("drink water evary day");
    }
    @Override
    public String toString() {
        return illnessName;
    }
}
