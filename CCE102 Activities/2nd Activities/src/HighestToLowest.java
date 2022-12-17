import java.util.Arrays;

public class HighestToLowest {
    public static void main(String[] args) {

        int numbers[] = { 12, 23, 120, 60, 320, 45, 93, 21, 60, 310 };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int container = 0;
                if (numbers[i] < numbers[j]) {
                    container = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = container;
                }
            }
        }
        System.out.print(Arrays.toString(numbers).replaceAll("(^\\[|\\]$)", ""));
        System.out.println();

    }
}
