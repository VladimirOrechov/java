package oop;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();        // экземпляр класса
        cat.setName("barsic");  
        System.out.println(cat.getName());
        Animal dog = new Animal("max", new Chumka("Chumka"), "Petr", LocalDate.of(3, 12, 21));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();

    }
}