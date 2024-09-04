package algorithms.basics;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
