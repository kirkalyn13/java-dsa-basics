package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] items = {8,3,5,11,21,2,24,1,7,13,9,18,17};
        System.out.println(Arrays.toString(items));
        sort(items);
        System.out.println(Arrays.toString(items));
    }

    private static void sort(int[] items) {
        boolean hasSwapped = true;

        while (hasSwapped) {
            hasSwapped = false;
            for (int i = 0; i < items.length - 1; i++) {
                if (items[i] > items[i + 1]) {
                    swap(items, i, i + 1);
                    hasSwapped = true;
                }
            }
        }
    }

    private static void swap(int[] items, int a, int b) {
        int temp = items[a];
        items[a] = items[b];
        items[b] = temp;
    }
}
