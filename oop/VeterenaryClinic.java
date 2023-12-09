package oop;

import java.util.ArrayList;
import java.util.List;

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
}
