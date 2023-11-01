import java.util.ArrayList;
import java.util.List;

public class lesson3 {

//     Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.
    
    // public static void main(String[] args) {
    
    // List<Integer> a = masRandom(5, 1, 5);
    // System.out.println(a);
    // a.sort(null);
    // System.out.println(a);
    
    // }
    
    // public static List<Integer> masRandom(int count, int min, int max){
    
    // List<Integer> mas = new ArrayList<>(count);
    // Random rand = new Random();
    // for (int i = 0; i < count; i++) {
    // mas.add(rand.nextInt(min, max+1));
    // }
    // return mas;
    // }
    



//     Создать список типа ArrayList
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.



/*
Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
Напишите метод для заполнения данной структуры. Только уникальные значения

[
["Роман", "Война и мир", "Мастер и Маргарита"],
["Сказка", "Золотой ключик", "Репка"],
["Фентези", "Гарри Поттер"]
]
// */
// public static void main(String[] args) {
//     List<List<String>> shopBook = new ArrayList<>();
//     addBook(shopBook, "Роман", "Война и мир");
//     addBook(shopBook, "Сказка", "Золотой ключик");
//     addBook(shopBook, "Роман", "Мастер и Маргарита");
//     addBook(shopBook, "Фентези", "Гарри Поттер");
//     addBook(shopBook, "Сказка", "Репка");
//     addBook(shopBook, "Сказка", "Репка");
//     addBook(shopBook, "Фентези", "Репка");
    
//     System.out.println(shopBook);
//     }
    
//     static void addBook(List<List<String>> shopBook, String genre, String nameBook){
//     for (int i = 0; i < shopBook.size(); i++) {
//     List<String> curList = shopBook.get(i);
//     if (curList.get(0).equalsIgnoreCase(genre)){
//     if (!curList.contains(nameBook)){
//     curList.add(nameBook);
//     }
//     return;
//     }
//     }
//     List<String> list = new ArrayList<>();
//     list.add(genre);
//     list.add(nameBook);
//     shopBook.add(list);
//     }
}
