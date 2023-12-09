package oop.Apteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
    private static PharmacyComponent azitranit;

    public static void main(String[] args) {
        PharmacyComponent azitroment = new Azitranit("Azitronit", "10 Мг", 50);
        PharmacyComponent azitroment1 = new Azitranit("Azitronit", "10 Мг", 50);
        PharmacyComponent pinicilin = new Pinicilin("Pinicilin", "10 Мг", 120);
        PharmacyComponent water = new Water("Water", "10 Мг", 20);
        PharmacyComponent water2 = new Water("Water", "10 Мг", 20);

        List<PharmacyComponent> pharmancyComponents = new ArrayList<>();
        pharmancyComponents.add(azitroment);
        pharmancyComponents.add(water2);
        pharmancyComponents.add(water);
        pharmancyComponents.add(pinicilin);

        System.out.println(pharmancyComponents);
    
        Collections.sort(pharmancyComponents);
        System.out.println(pharmancyComponents);

        Pharmacy pharmacy1 = new Pharmacy().addComponent(water).addComponent(azitranit).addComponent(pinicilin);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(water).addComponent(pinicilin);

        for (PharmacyComponent comp: pharmacy1) {
            System.out.println(comp.getName());
        }
        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);


        Set<PharmacyComponent> set = new HashSet<>();
        set.add(azitroment);
        set.add(azitroment1);
        set.add(azitroment);

        System.out.println("/////////////////////////");
        System.out.println(set);



        // Iterator<PharmacyComponent> iterator = (Iterator<PharmacyComponent>) pharmacy1;
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }
        // while (((Iterator<PharmacyComponent>) pharmacy1).hasNext()){
        // System.out.println(((Iterator<PharmacyComponent>) pharmacy1).next());
        // }
        
    }
}
