package algorithms.basics;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(100, 3, 5);
    }

    public static void fizzBuzz(int iterations, int a, int b) {
        for (int i = 1; i <= iterations ; i++) {
            StringBuilder output = new StringBuilder();
            if (i % a == 0) output.append("Fizz");
            if (i % b == 0) output.append("Buzz");
            if (output.isEmpty()) System.out.println(i);
            else System.out.println(output);
        }
    }
}
