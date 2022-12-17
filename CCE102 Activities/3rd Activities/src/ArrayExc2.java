import java.util.Arrays;

public class ArrayExc2 {

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

        int secondSmallest = array[1];

        System.out.println("Second Smallest Element: " + secondSmallest);
        System.out.println();

    }

}
