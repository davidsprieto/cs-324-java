package WeekSix;

public class HarmonicNumber {

    public static void main(String[] args) {
        // Testing non-recursive method
        int a = 5;
        double resultA = nonRecursiveHarmonicNumber(a);
        System.out.println("The " + a + "th harmonic number is: " + resultA);

        // Testing recursive method
        int b = 5;
        double resultB = recursiveHarmonicNumber(b);
        System.out.println("The " + b + "th harmonic number is: " + resultB);
    }

    public static double nonRecursiveHarmonicNumber(int n) {
        double result = 0.0;
        for (int k = 1; k <= n; k++) {
            result += 1.0 / k;
        }
        return result;
    }

    public static double recursiveHarmonicNumber(int n) {
        // Base case: the harmonic number of 1 is always 1.0
        if (n == 1) return 1.0;
        // Recursive case: H(n) = H(n-1) + 1/n
        else return recursiveHarmonicNumber(n - 1) + 1.0 / n;
    }

}
