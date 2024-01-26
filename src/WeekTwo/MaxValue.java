package WeekTwo;

import java.util.Random;

public class MaxValue {

    public static void main(String[] args) {
        // Test cases:

        // Create an array of 1000 random numbers
        int[] oneTestArray = randomDataArray(1000);
        // Find the maximum number in the array
        int oneMaxValue = findMax(oneTestArray);
        // Display the result
        System.out.println("Max value for test array one: " + oneMaxValue);

        int[] twoTestArray = randomDataArray(1000);
        int twoMaxValue = findMax(twoTestArray);
        System.out.println("Max value for test array two: " + twoMaxValue);

        int[] threeTestArray = randomDataArray(1000);
        int threeMaxValue = findMax(threeTestArray);
        System.out.println("Max value for test array three: " + threeMaxValue);
    }


    // Function that finds the maximum number in an array
    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }


    // Function that creates an array of random numbers up to 5000
    public static int[] randomDataArray(int length) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(5000);
        }

        return array;
    }

}
