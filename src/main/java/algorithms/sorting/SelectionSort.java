package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] items = {8,3,5,11,21,2,24,1,7,13,9,18,17};
        System.out.println(Arrays.toString(items));
        sort(items);
        System.out.println(Arrays.toString(items));
    }

    private static void sort(int[] items) {
        for (int i = 0; i <= items.length - 1; i++) {
            for (int j = 0; j <= items.length - 1; j++) {
                if (items[i] < items[j]) swap(items, i, j);
            }
        }
    }

    private static void swap(int[] items, int a, int b) {
        int temp = items[a];
        items[a] = items[b];
        items[b] = temp;
    }
}
