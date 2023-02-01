/*Пусть дан произвольный список целых чисел, удалить из него чётные числа*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class EvenNumsDelete {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillList(list, 10, 50);
        System.out.println(list);
        System.out.println();
        System.out.println(deleteEvenNumbers(list));
    }

    private static void fillList(List<Integer> l, int size, int bound) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            l.add(rand.nextInt(bound));
        }
    }

    private static List<Integer> deleteEvenNumbers(List<Integer> l) {
        return l.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
    }
}
