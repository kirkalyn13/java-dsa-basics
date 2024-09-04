package algorithms.basics;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("eve"));
    }

    private static boolean isPalindrome(String text) {
        return new StringBuilder(text).reverse().toString().equalsIgnoreCase(text);
    }
}
