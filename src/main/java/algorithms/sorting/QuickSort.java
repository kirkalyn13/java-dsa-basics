package algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] items = {8,3,5,11,21,2,24,1,7,13,9,18,17};
        System.out.println(Arrays.toString(items));
        sort(items);
        System.out.println(Arrays.toString(items));
    }

    private static void sort (int[] items) {
        sort(items, 0, items.length - 1);
    }

    private static void sort(int[] items, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) return;

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = items[pivotIndex];
        swap(items, pivotIndex, highIndex);

        int lp = partition(items, lowIndex, highIndex, pivot);

        sort(items, lowIndex, lp -1);
        sort(items, lp + 1, highIndex);

    }

    private static int partition(int[] items, int lowIndex, int highIndex, int pivot) {
        int lp = lowIndex;
        int rp = highIndex - 1;

        while (lp < rp) {
            while(items[lp] <= pivot && lp < rp) lp++;
            while(items[rp] >= pivot && lp < rp) rp--;
            swap(items, lp, rp);
        }

        if (items[lp] > items[highIndex]) {
            swap(items, lp, highIndex);
        } else {
            lp = highIndex;
        }

        return lp;
    }

    private static void swap(int[] items, int a, int b) {
        int temp = items[a];
        items[a] = items[b];
        items[b] = temp;
    }
}
