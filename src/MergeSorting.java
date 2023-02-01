/*Реализовать алгоритм сортировки слиянием*/

import java.util.Arrays;
import java.util.Random;

public class MergeSorting {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillArray(numbers, 50);
        System.out.println("UnSosted: " + Arrays.toString(numbers));
        System.out.println();

        mergeSort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
    }

    private static void fillArray(int[] arr, int bound) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(bound);
        }
    }

    private static void mergeSort(int[] arr) {
        int size = arr.length;

        if (size < 2) {
            return;
        }

        int middle = size / 2;
        int[] left = new int[middle];
        int[] right = new int[size - middle];

        System.arraycopy(arr, 0, left, 0, middle);
        System.arraycopy(arr, middle, right, 0, size - middle);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right, middle, size - middle);
    }

    private static void merge(int[] arr, int[] left, int[] right, int leftSize, int rightSize) {
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            arr[k++] = left[i++];
        }
        while (j < rightSize) {
            arr[k++] = right[j++];
        }
    }
}
