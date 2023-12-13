package oop.Clinic;

public class Nurse {
    protected String name;  
    protected String secondName;
    protected String experience;
    protected int level;
    protected String help;

    
    public Nurse(String name, String secondName, String experience, int level, String help) {
        this.name = name;
        this.secondName = secondName;
        this.experience = experience;
        this.level = level;
        this.help = help;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getExperience() {
        return experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getHelp() {
        return help;
    }
    public void setHelp(String help) {
        this.help = help;
    }
    @Override
    public String toString() {
        return "Nurse [name=" + name + ", secondName=" + secondName + ", experience=" + experience + ", level=" + level
                + ", help=" + help + "]";
    }
}
