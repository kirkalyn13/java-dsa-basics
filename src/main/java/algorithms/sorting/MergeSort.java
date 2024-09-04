package algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] items = {8,3,5,11,21,2,24,1,7,13,9,18,17};
        System.out.println(Arrays.toString(items));
        sort(items);
        System.out.println(Arrays.toString(items));
    }

    private static void sort(int[] items) {
        int itemsSize = items.length;

        if (itemsSize < 2) return;

        int mid = itemsSize / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[itemsSize - mid];

        for (int i = 0; i < mid; i++) {
            leftHalf[i] = items[i];
        }

        for (int i = mid; i < itemsSize; i++) {
            rightHalf[i - mid] = items[i];
        }

        sort(leftHalf);
        sort(rightHalf);

        merge(items, leftHalf, rightHalf);
    }

    private static void merge(int[] items, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                items[k] = leftHalf[i];
                i++;
            } else {
                items[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            items[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            items[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
