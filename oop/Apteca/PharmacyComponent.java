package oop.Apteca;

public class PharmacyComponent implements Comparable<PharmacyComponent>{
    private String name;
    private String weight;
    private int power;

    public PharmacyComponent(String name, String weight, int power){
        this.name = name;
        this.weight = weight;
        this.power = power;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String setWeight(){
        return name;
    }
    public void getWeight(String weight){
        this.weight = weight;
    }
    public int getPower(){
        return power;
    }
    public void setPower(){
        this.power = power;
    }
    @Override
    public String toString() {
    return "PharmancyComponent{" +
    "name='" + name + '\'' +
    ", weight='" + weight + '\'' +
    ", power=" + power +
    '}';
    }
    @Override
    public int compareTo(PharmacyComponent o) {
        if(power > o.power){
            return 1;
        }
        else if (this.power < o.power){
            return -1;
        }
        return 0;
    }
}




