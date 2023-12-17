package oop.Apteca;

public interface Copmaparable {

@Override
public int compareTo(Pharmacy o) {
    if (weight > o.weight){
        return 1;
    }
    else if (this.weight < o.weight){
        return -1;
    }
    return 0;
}
}
