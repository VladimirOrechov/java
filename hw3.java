
import java.util.Arrays;

    

    // Внутри класса MergeSort напишите метод mergeSort, 
    // который принимает массив целых чисел a и реализует алгоритм сортировки слиянием.
    //  Метод должен возвращать отсортированный массив.

class MergeSort {

    public static void main(String[] args){
        
        int[] a = {5, 1, 6, 2, 3, 4};
        Arrays.sort(a);
        

        for (int values :a) {
            System.out.print(values + ", ");
    
    }
}
}