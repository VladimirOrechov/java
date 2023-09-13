import java.time.LocalTime;
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        task1();
    }
    static void task0(){


        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        
        LocalTime LocalTime = java.time.LocalTime.now();
        int hour = LocalTime.getHour();
        System.out.println(hour);

        if(hour >= 5 && hour < 12){ 
            System.out.println("Доброе утро," + name);
        }else if ( hour < 18) {
           System.out.println("Добрый день," + name); 
        }else if ( hour < 23) {
           System.out.println("Добрый вечер," + name);
        }else {
            System.out.println("Доброй ночи," + name);
        } 
        scanner.close();


    }

    static void task1(){
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 1, 1};
        int counte = 0; 
        int max0nse = 1;
        for ( int i = 0 ; i < arr.length; i++) {
            if (arr[i] == 1){
                counte++;
            }if(arr[i] == 0 || i == arr.length - 1 ) {
                if(counte > max0nse){
                    max0nse = counte;
                }
                counte =  0;
            }   
        }
        if(counte > max0nse){
            max0nse = counte;
        }
        System.out.println(max0nse);

    }


    static void task2(){
        
    }




}

