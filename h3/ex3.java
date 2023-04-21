
import static java.util.Collections.max;
import static java.util.Collections.min;

import java.util.ArrayList;
import java.util.Random;


public class ex3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list1);
        
        int max = max(list1);
        int min = min(list1);

        int sumItems = 0;
        float average = (float)sumItems/list1.size();

        System.out.printf("Максимальный элемент %s\n", max);
        System.out.printf("Минимальный элемент  %s\n", min);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}
