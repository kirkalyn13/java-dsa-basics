package algorithms.basics;

public class Fibonacci {
    private static long[] cache;

    public static void main(String[] args) {
      int n = 5;
      cache = new long[n + 1];
      System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
      if (n <= 2) return n;
      if (cache[n] != 0) return cache[n];

      cache[n] = fibonacci(n - 1) + fibonacci(n - 2);
      return cache[n];
    }
    // 1,1,2,3,5,8,13
}
