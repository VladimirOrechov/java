package oop.Apteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorComponent implements Iterator<PharmacyComponent> {

    private List<PharmacyComponent> components;
    private int index;
    private Pharmacy pharmacy;


    public IteratorComponent(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
        components = pharmacy.components();
        index = pharmacy.getIndex();
    }
    @Override
    public boolean hasNext() {
        index = pharmacy.getIndex();
        return index < components.size();
    }
    @Override
    public PharmacyComponent next() {
        return components.get(index++);
    }
}
