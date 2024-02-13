package WeekFour;

public class SumOddIntegers {

    public static void main(String[] args) {
        // Test cases

        long start1 = System.nanoTime();
        System.out.println("Sum of all odd integers up to 500: " + sumOdd(500));
        long end1 = System.nanoTime();
        long execution1 = end1 - start1;
        System.out.println("Execution time of 500 is: " + execution1);

        long start2 = System.nanoTime();
        System.out.println("Sum of all odd integers up to 5000: " + sumOdd(5000));
        long end2 = System.nanoTime();
        long execution2 = end2 - start2;
        System.out.println("Execution time of 5000 is: " + execution2);

        long start3 = System.nanoTime();
        System.out.println("Sum of all odd integers up to 50000: " + sumOdd(50000));
        long end3 = System.nanoTime();
        long execution3 = end3 - start3;
        System.out.println("Execution time of 50000 is: " + execution3);
    }

    public static int sumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}

