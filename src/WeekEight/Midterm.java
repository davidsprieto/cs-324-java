package WeekEight;

public class Midterm {
    public static void main(String[] args) {
        // Testing recursive method
        int a = 5;
        long start1 = System.nanoTime();
        System.out.println("The " + a + "th harmonic number for a recursive method is: " + recursiveHarmonicNumber(a));
        long end1 = System.nanoTime();
        long execution1 = end1 - start1;
        System.out.println("Execution time of recursive method is: " + execution1);

        // Testing non-recursive method
        int b = 5;
        long start2 = System.nanoTime();
        System.out.println("The " + b + "th harmonic number for a non-recursive method is: " + nonRecursiveHarmonicNumber(b));
        long end2 = System.nanoTime();
        long execution2 = end2 - start2;
        System.out.println("Execution time of non-recursive method is: " + execution2);
    }

    public static double recursiveHarmonicNumber(int n) {
        if (n == 1) return 1.0;
        else return recursiveHarmonicNumber(n - 1) + 1.0 / n;
    }

    public static double nonRecursiveHarmonicNumber(int n) {
        double result = 0.0;
        for (int k = 1; k <= n; k++) {
            result += 1.0 / k;
        }
        return result;
    }

}
