import java.time.LocalTime;
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        task0();
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
}