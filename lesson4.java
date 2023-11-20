import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class lesson4 {

// public static void main(String[] args) {
//     List<Integer> list1 = new ArrayList<>();
//     List<Integer> list2 = new LinkedList<>();
//     System.out.println(work(list1));
//     System.out.println(work(list2));

//     }
//     private static long work(List<Integer> list){
//         long timeStart = System.currentTimeMillis();
//         for(int i = 0; i < 100000; i++){
//             list.add(list.size()/2, i);
//         }
//         long timeFinish = System.currentTimeMillis();
//         return timeFinish - timeStart;
//     }




// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка


// public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     List<String> list = new LinkedList<>();
//     while (true) {
//         String line = scan.nextLine();
//         String text = line.split("~")[0];
//         int num = Integer.parseInt(line.split("~")[1]);
//         if (text.equals("print")) {
//             String str = list.remove(num);
//             System.out.println("Вывели и удалили " + str);
//         }
//             else {
//                 list.add(num, text);
//             }
//         }
//     }



/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
*/

// private static int index;

// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     List<String> list = new LinkedList<>();
//     boolean work = true;
//     while (work) {
//         String line = scanner.nextLine();
//         switch (line) {
//             case "print":
//             for (String s : list){
//                 System.out.println(s);
           // }
            // for (int i = list.size() - 1; i >= 0; i--) {
            //     System.out.println(list.get(i));
            // }

            // ListIterator<String> iterator = list.listIterator(list.size());{
            // while ( iterator.hasPrevious())  // hasPrevious возвращает предидущий элемент и сдвигается
            //     System.out.println();
            //     }



//                 break;
//             case "revert":
//                 list.remove(0);   
//                 // list.remove(list.size()-1);
//                 break;
//             case "finish":   
//                 work = false;             
//                 break;
//             default:
//                 list.add(index , line);   
//         }
//     }
// }



}





 