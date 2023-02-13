package Practice;

import java.util.Arrays;

public class prac10 {
    // Calculate the average value of array elements
    public static void main(String[] args) {
        int numbers[] = {23, 24, 12, 16, 12, 10, 23, 14};

        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        int average = sum / numbers.length;

        System.out.println();
        System.out.println("Average: " + average);
    }

}
