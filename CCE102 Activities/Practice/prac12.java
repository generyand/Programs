package Practice;

import java.util.Arrays;

public class prac12 {

    public static void main(String[] args) {

        int array[] = { 20, 114, 1, 31, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 5, 10, 12, 41 };
        System.out.println(Arrays.toString(array));
        System.out.println();

        int container;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    container = array[i];
                    array[i] = array[j];
                    array[j] = container;
                }
            }
        }

        int secondSmallest = 0;
        int i = 0;
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] > array[i]) {
                secondSmallest = array[j];
                break;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Second Smallest: " + secondSmallest);

    }

}
