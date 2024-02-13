package WeekFour;

public class SumOddIntegers {

    public static void main(String[] args) {
        // Test cases:

        long start1 = System.nanoTime();
        System.out.println("Sum of all odd integers up to 100: " + sumOdd(100));
        long end1 = System.nanoTime();
        long execution1 = end1 - start1;
        System.out.println("Execution time of 100 is: " + execution1);

        long start2 = System.nanoTime();
        System.out.println("Sum of all odd integers up to 200: " + sumOdd(200));
        long end2 = System.nanoTime();
        long execution2 = end2 - start2;
        System.out.println("Execution time of 200 is: " + execution2);

        long start3 = System.nanoTime();
        System.out.println("Sum of all odd integers up to 300: " + sumOdd(300));
        long end3 = System.nanoTime();
        long execution3 = end3 - start3;
        System.out.println("Execution time of 300 is: " + execution3);

        long start4 = System.nanoTime();
        System.out.println("Sum of all odd integers up to 400: " + sumOdd(400));
        long end4 = System.nanoTime();
        long execution4 = end4 - start4;
        System.out.println("Execution time of 400 is: " + execution4);
    }

    public static int sumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}

