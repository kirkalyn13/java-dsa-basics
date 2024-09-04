package algorithms.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] items = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(items, 5));
    }

    private static int search(int[] items, int n) {
        return search(items, 0, items.length, n);
    }

    private static int search(int[] items, int l, int r, int n) {
        if (l <= r && l <= items.length - 1) {
            int mid = (l + r) / 2;
            if (items[mid] == n) return mid;
            if (items[mid] > n) return search(items, l, mid - 1, n);
            return search(items, mid + 1, r, n);
        }
        return -1;
    }
}
