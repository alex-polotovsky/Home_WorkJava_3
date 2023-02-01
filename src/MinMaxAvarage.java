/*Задан целочисленный список ArrayList.
  Найти минимальное, максимальное и среднее арифметическое этого списка.*/


import java.util.*;

public class MinMaxAvarage {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        fillList(integerList, 15, 20);
        System.out.println(integerList);

        int min = getMin(integerList);
        int max = getMax(integerList);
        double average = getAverage(integerList);

        System.out.printf("min = %d, max = %d, average = %f", min, max, average);
    }

    private static void fillList(List<Integer> l, int size, int bound) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            l.add(rand.nextInt(bound));
        }
    }
    private static int getMin(List<Integer>lst){
        return Collections.min(lst);
    }
    private static int getMax(List<Integer>lst){
        return Collections.max(lst);
    }
    private static double getAverage(List<Integer>lst){
        return lst.stream().mapToInt(i->i).average().orElse(0);
    }
}