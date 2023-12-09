package oop;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();        // экземпляр класса
        cat.setName("barsic");
        System.out.println(cat.getName());
        Dog dog = new Dog("max", new Chumka("Chumka"), "Petr", LocalDate.of(3, 12, 21));
        System.out.println(dog.getName());
        Fish fish = new Fish();
        Bird bird = new Bird();
        Panther panther = new Panther();

        // System.out.println(dog.getIllness());    
        // dog.getIllness().heal();
        // dog.toWakeUp("13:52");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);    
        animals.add(cat);
        animals.add(dog);
        animals.add(fish);
        animals.add(bird);
        animals.add(panther);

        VeterenaryClinic clinic = new VeterenaryClinic();
        clinic.addPatietnt(cat).addPatietnt(dog).addPatietnt(bird).addPatietnt(panther).addPatietnt(fish);
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoable());

        // cat.liveCicle();
        // System.out.println("------------");
        // dog.liveCicle();
        // System.out.println("------------");
        // fish.liveCicle();
        // System.out.println("------------");
        // bird.liveCicle();
        // System.out.println("------------"); 
        // panther.liveCicle();
        // System.out.println("------------");
        
        // System.out.println(getRunSpeed);

    }
}