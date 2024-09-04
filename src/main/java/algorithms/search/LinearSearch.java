package algorithms.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] items = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(items, 4));
    }

    private static int search(int[] items, int n) {
        for (int i = 0; i <= items.length - 1; i++) {
            if (items[i] == n) return i;
        }
        return -1;
    }
}
