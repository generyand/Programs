package Practice;

import java.util.Arrays;

public class prac1 {

    public static void main(String[] args) {

        int numbers[] = { 12, 23, 120, 60, 320, 45, 93, 21, 60, 310 };

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Elements: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
    }

}
