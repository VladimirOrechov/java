package oop.Apteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//  описываем лекарства                    перебор компонентов
public class Pharmacy implements Iterable<PharmacyComponent> {
    // список компанентов
    private List<PharmacyComponent> components = new ArrayList<>();
    private int index = 0;

    public Pharmacy addComponent(PharmacyComponent component){
    components.add(component);
    return this;
    }
    List<PharmacyComponent> components() {
        return components();
    }
    // @Override
    // public boolean hasNext() {
    //     return index < components.size();
    // }
    // @Override
    // public PharmacyComponent next() {
    //     return components.get(index++);
    // }
    @Override
    public String toString() {
    return "Pharmacy{" +
    "components=" + components +
    ", index=" + index +
    '}';
    }

    
    @Override
    public Iterator<PharmacyComponent> iterator() {
        return new Iterator<PharmacyComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public PharmacyComponent next() {
                return components.get(index++);
            }
        };
    }
    public int getIndex() {
        return 0;
    }


}
