package oop.Apteca;


import java.util.*;

public class Main {


    public static void main(String[] args) {

        PharmacyComponent azitronit = new Azitranit("Azitronit", "10 Мг", 50);
        PharmacyComponent azitronit1 = new Azitranit("Azitronit", "10 Мг", 50);
        PharmacyComponent pinicilin = (PharmacyComponent) new Pinicilin("Pinicilin", "10 Мг", 120);
        PharmacyComponent water = new Water("Water", "10 Мг", 20);
        PharmacyComponent water2 = new Water("Water", "10 Мг", 20);
        
        Pharmacy pharmacy1 = new Pharmacy().addComponent(azitronit).addComponent(water).addComponent(pinicilin);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(pinicilin).addComponent(water);


        for (PharmacyComponent comp: pharmacy1) {
            System.out.println(comp.getName());
        }

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);


        List<PharmacyComponent> pharmancyComponents = new ArrayList<>();
        pharmancyComponents.add(azitronit);
        pharmancyComponents.add(water2);
        pharmancyComponents.add(water);
        pharmancyComponents.add(pinicilin);
        
        System.out.println(pharmancyComponents);

        Collections.sort(pharmancyComponents);
        System.out.println(pharmancyComponents);
        
        
        Set<PharmacyComponent> set = new HashSet<>();
        set.add(azitronit);
        set.add(azitronit1);
        set.add(azitronit1);

        System.out.println("/////////////////////////");
        System.out.println(set);

        // //  вывод данных в консоль с помощью итератора
        // Iterator<PharmacyComponent> iterator = pharmacy1;
        // while (iterator.hasNext()){         // рабочее решение
        //    System.out.println(iterator.next());
                // Аналог
        // }  
        // while (((Iterator<PharmacyComponent>) pharmacy1).hasNext()) {
        // System.out.println(((Iterator<PharmacyComponent>) pharmacy1).next());         //Рабочее решение пример
        // }



       




        

        // List<Pharmacy> pharmacies = new ArrayList<>();
        // pharmacies.add(pharmacy1);
        // pharmacies.add(pharmacy2);


        // System.out.println("/////////////////////////");
        // System.out.println(set);

        //Collections.sort(pharmacies, new );


    }
}