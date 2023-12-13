package oop.Clinic;

public class Doctor {
    protected String name;  
    protected String secondName;
    protected String experience;
    protected int level;     //  квалификация
    protected String diagnostics;
    protected String heal;

    
    
    public Doctor(String name, String secondName, String experience, int level, String heal) {
        this.name = name;
        this.secondName = secondName;
        this.experience = experience;
        this.level = level;
        this.heal = heal;
    }

    @Override
    public String toString() {
        return "Doctor [name=" + name + ", secondName=" + secondName + ", experience=" + experience + ", level=" + level
        + ", heal=" + heal + "]";
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getSecondName() {
        return secondName;
    }
    
    public void setExperience(String experience) {
        this.experience = experience;
    }
     public String getExperience() {
        return experience;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }
    public Doctor(String diagnostics) {
        this.diagnostics = diagnostics;
    }
    public void setHeal(String heal) {
        this.heal = heal;
    }
    public String getHeal() {
        return heal;
    }
}
