package oop.Clinic;

import java.util.ArrayList;
import java.util.List;

import oop.Aminals.Animal;
import oop.Aminals.Flyable;
import oop.Aminals.Goable;
import oop.Aminals.Speakble;
import oop.Aminals.Swimable;
//  добавили список Animal
public class VeterenaryClinic {
    private List<Animal> patients = new ArrayList<>();
    public List<Animal> getPatients() {
        return patients;
    }
    public VeterenaryClinic addPatietnt(Animal patient) {
        patients.add(patient);
        return this;
    }
    public void removePatient(Animal patient) {
        patients.remove(patient);
    }

    public List<Goable> getGoable() {
        List<Goable> result = new ArrayList<>();
        //   спиок  имяСписка Массив по которому проходим
        for (Animal animal: patients) {    
            if(animal instanceof Goable) {
                result.add((Goable)animal);
            } 
        }
        return result;
    }
    public List<Speakble> getSpeakble() {
        List<Speakble> result = new ArrayList<>();
        //   спиок  имяСписка Массив по которому проходим
        for (Animal animal: patients) {     
            if(animal instanceof Speakble) {
                result.add((Speakble)animal);
            } 
        }
        return result;
    }
    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        //   спиок  имяСписка Массив по которому проходим
        for (Animal animal: patients) {      
            if(animal instanceof Flyable) {
                result.add((Flyable)animal);
            } 
        }
        return result;
    }
    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        //   спиок  имяСписка Массив по которому проходим
        for (Animal animal: patients) { 
            if(animal instanceof Swimable) {
                result.add((Swimable)animal);
            } 
        }
        return result;
    }
}
