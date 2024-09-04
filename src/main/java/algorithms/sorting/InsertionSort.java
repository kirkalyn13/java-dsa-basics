package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] items = {8,3,5,11,21,2,24,1,7,13,9,18,17};
        System.out.println(Arrays.toString(items));
        sort(items);
        System.out.println(Arrays.toString(items));
    }

    private static void sort(int[] items) {
        for (int i = 1; i <= items.length - 1 ; i++) {
            int toInsert = items[i];
            int j = i - 1;

            while (j >= 0 && toInsert <= items[j]) {
                items[j + 1] = items[j];
                items[j] = toInsert;
                j--;
            }
        }
    }
}
