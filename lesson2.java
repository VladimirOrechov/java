// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
// Ответ: c1c2c1…c2 (всего N символов)


// public class lesson2{

//     public static void main(String[] args) {

//         System.out.println(nCount(5, 'a', 'b'));
//         }
        
//         static String nCount(int n, char c1, char c2){
        
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < n; i++) {
//         if (i % 2 == 0){
//             sb.append(c1);
//         }
//             else sb.append(c2);
//         }
        
//             return sb.toString();
//         }



// }




// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.
// Результат: a4b3cd2

// public class lesson2{

// public static void main(String[] args) {
// String s = "aaaabbbcdd";
// System.out.println(work(s));
// }

// /**
//  * @param s
//  * @return
//  */
// static String work(String s) {
// StringBuilder stringBuilder = new StringBuilder();
// int count = 0;
// char cur = s.charAt(0);
// for (int i = 0; i < s.length(); i++) {
// char item = s.charAt(i);
// if (item == cur) {
// count++;
// } else {
// stringBuilder.append(cur);
// if (count > 1) {
// stringBuilder.append(count);
// count = 1;
// }
// cur = item;
// }
// }
// stringBuilder.append(cur);
// if (count > 1) {
// stringBuilder.append(count);
// }
// return stringBuilder.toString();
// }
// }


// public class lesson2{
// public static void main(String[] args) {
// String text = "A man, a plan — a canal, panama";
// System.out.println(isPolindrom(text));
// }

// static boolean isPolindrom(String text){

// text = text.toLowerCase().replace(" ", "").replace(",", "").replace("—", "");
// StringBuilder sb = new StringBuilder();
// for (int i = text.length()-1; i >= 0; i--) {
// sb.append(text.charAt(i));
// }
// return text.contentEquals(sb);
// }
// }



// Напишите метод, который составит строку, состоящую из 100 повторений 
// слова TEST и метод, который запишет эту строку в простой текстовый файл, 
// обработайте исключения.


public class lesson2{



}