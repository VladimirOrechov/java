// import java.time.LocalTime;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

// public class project1 {
//     public static void main(String[] args) {
//         task0();
//     }
//     static void task0(){
//         System.out.println("Как тебя зовут?");
//         Scanner scanner = new Scanner(System.in);
//         String name = scanner.nextLine();
        
//         LocalTime LocalTime = java.time.LocalTime.now();
//         int hour = LocalTime.getHour();
//         System.out.println(hour);

//         if(hour >= 5 && hour < 12){ 
//             System.out.println("Доброе утро," + name);
//         }else if ( hour < 18) {
//            System.out.println("Добрый день," + name); 
//         }else if ( hour < 23) {
//            System.out.println("Добрый вечер," + name);
//         }else {
//             System.out.println("Доброй ночи," + name);
//         } 
//         scanner.close();
//     }
// }

    // static void task1(){
    //     int[] arr = {1, 0, 1, 0, 1, 0, 1, 1, 1};
    //     int counte = 0; 
    //     int max0nse = 1;
    //     for ( int i = 0 ; i < arr.length; i++) {
    //         if (arr[i] == 1){
    //             counte++;
    //         }if(arr[i] == 0 || i == arr.length - 1 ) {
    //             if(counte > max0nse){
    //                 max0nse = counte;
    //             }
    //             counte =  0;
    //         }   
    //     }
    //     if(counte > max0nse){
    //         max0nse = counte;
    //     }
    //     System.out.println(max0nse);

    // }


   


        // public static void main(String[] args) {
        //     int[] arr = {3,2,5,3};
        //     int val = 3;
        //     int[] res = sort(arr, val);
        //     System.out.println(Arrays.toString(res));
        // }
    
        // static int[] sort(int[] arr, int val){
        //     int[] res = new int[arr.length];
        //     Arrays.fill(res, val);
        //     for (int i = 0, j = 0; i < arr.length; i++) {
        //         if (arr[i] != val){
        //             res[j] = arr[i];
        //             j++;
        //         }
        //     }
        //     return res;
        // }
        
   
        // public static void main(String[] args){

        //     String s = "Добро пожаловать на курс по Java";
        //     String[] words = s.split(" ");
        //     for (int i = words.length - 1; i >= 0; i --){
        //         System.out.print(words[i] + " ");
        //     }


        // }
/*
    // Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
    // Пример 1: а = 3, b = 2, ответ: 9
    // Пример 2: а = 2, b = -2, ответ: 0.25
    // Пример 3: а = 3, b = 0, ответ: 1
    //  */
    // // public static void main(String[] args) {
    // //     double a = 0.5;
    // //     int b = 3;
    // //     System.out.println(pow(a, b));
    // // }

    // // static double pow(double a, int b){
    // //     if (b == 0 || a == 1){
    // //         return 1;
    // //     }
    // //     if (b < 0){
    // //         a = 1.0 / a;
    // //         b = -b;
    // //     }
    // //     double res = a;
    // //     for (int i = 1; i < b; i++) {
    // //         res *= a;
    // //     }
    // //     return res;
    // // }


    // }


