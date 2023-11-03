import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class lesson4 {

public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();
    System.out.println(work(list1));
    System.out.println(work(list2));

    }
    private static long work(List<Integer> list){
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            list.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
}
