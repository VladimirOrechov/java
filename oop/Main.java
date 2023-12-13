package oop;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();        // экземпляр класса
        // cat.setName("barsic");
        // System.out.println(cat.getName());
        Dog dog = new Dog("max", new Chumka("Chumka"), "Petr", LocalDate.of(3, 12, 21));
        // System.out.println(dog.getName());
        Fish fish = new Fish();
        Fish2 fish2 = new Fish2();
        Bird bird = new Bird();
        Bird bird1 = new Bird();
        Panther panther = new Panther(); 

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat); 
        cat.setName("Barsik");   
        animals.add(dog);
        dog.setName("Max");
        animals.add(fish);
        fish.setName("Karas");
        animals.add(fish2);
        fish2.setName("Shuca");
        animals.add(bird);
        bird.setName("GoldenBird");
        animals.add(bird1);
        bird1.setName("AngryBird");
        animals.add(panther);
        panther.setName("Sharchan");

        VeterenaryClinic clinic = new VeterenaryClinic();
        clinic.addPatietnt(cat).addPatietnt(dog).addPatietnt(bird).addPatietnt(panther).addPatietnt(fish).addPatietnt(fish2).addPatietnt(bird1);
        System.out.println(clinic.getPatients());
        System.out.println("-----");
        System.out.println(clinic.getGoable());
        System.out.println("-------");
        System.out.println(clinic.getSwimable());
        System.out.println("---------");
        System.out.println(clinic.getSpeakble());
        System.out.println("-------");
        System.out.println(clinic.getFlyable());


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
        
        // System.out.println(cat.getRunSpeed);

    }
}