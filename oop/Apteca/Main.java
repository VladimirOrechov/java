package oop.Apteca;


import java.util.*;

public class Main {


    public static void main(String[] args) {

        PharmacyComponent azitronit = new Azitranit("Azitronit", "10 Мг", 70);
        PharmacyComponent azitronit1 = new Azitranit("Azitronit", "10 Мг", 50);
        PharmacyComponent pinicilin = new Pinicilin("Pinicilin", "10 Мг", 120);
        PharmacyComponent water = new Water("Water", "10 Мг", 20);
        PharmacyComponent water2 = new Water("Water", "10 Мг", 50);
        
        Pharmacy pharmacy1 = new Pharmacy().addComponent(azitronit).addComponent(water).addComponent(pinicilin);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(azitronit1).addComponent(water).addComponent(pinicilin);
        Pharmacy pharmacy3 = new Pharmacy().addComponent(pinicilin).addComponent(water).addComponent(pinicilin);
        Pharmacy pharmacy4 = new Pharmacy().addComponent(pinicilin).addComponent(water).addComponent(pinicilin);
        Pharmacy pharmacy5 = new Pharmacy().addComponent(pinicilin).addComponent(water);
        Pharmacy pharmacy6 = new Pharmacy().addComponent(pinicilin).addComponent(water);

        // for (PharmacyComponent comp: pharmacy1) {
        //     System.out.println(comp.getPower());
        //     System.out.println(comp.getName());
        // }

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);
        pharmacies.add(pharmacy4);
        pharmacies.add(pharmacy5);
        pharmacies.add(pharmacy6);


        List<PharmacyComponent> pharmancyComponents = new ArrayList<>();
        pharmancyComponents.add(azitronit);
        pharmancyComponents.add(azitronit1);
        pharmancyComponents.add(azitronit1);
        pharmancyComponents.add(pinicilin);
        pharmancyComponents.add(water);
        pharmancyComponents.add(water2);

        System.out.println(pharmancyComponents);

        Collections.sort(pharmancyComponents);
        System.out.println("----------");
        System.out.println(pharmancyComponents);
        
        
        Set<PharmacyComponent> set = new HashSet<>();
        set.add(azitronit);
        set.add(azitronit1);
        set.add(azitronit1);
        set.add(pinicilin);
        set.add(water);    
        set.add(water2);

        System.out.println("/////////////////////////");
        System.out.println(set);
        System.out.println("-------");
        


        Set<Pharmacy> result = new HashSet<>();

        result.add(pharmacy1);
        result.add(pharmacy2);        
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        result.add(pharmacy4);
        result.add(pharmacy5);
        result.add(pharmacy6);
        result.add(pharmacy6);


       
        System.out.println(result.size());

        // //  вывод данных в консоль с помощью итератора
        // Iterator<PharmacyComponent> iterator = pharmacy1;
        // while (iterator.hasNext()){         // рабочее решение
        //    System.out.println(iterator.next());
                // Аналог
        // }  
        // while (((Iterator<PharmacyComponent>) pharmacy1).hasNext()) {
        // System.out.println(((Iterator<PharmacyComponent>) pharmacy1).next());         //Рабочее решение пример
        // }


    }

    // private static int getName() {
    //     return 0;
    // }
}