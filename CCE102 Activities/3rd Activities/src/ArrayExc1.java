import java.util.Arrays;

public class ArrayExc1 {

    public static void main(String[] args) {

        int array[] = { 12, 23, 54, 56, 13, 75, 310, 14 };

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int container = 0;
                if (array[i] > array[j]) {
                    container = array[i];
                    array[i] = array[j];
                    array[j] = container;
                }
            }
        }

        int secondLargest = array[array.length - 2];

        System.out.println("Second Largest Element: " + secondLargest);
        System.out.println();

    }
    
}
