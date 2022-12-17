package Practice;

public class prac5 {
    
    public static void main(String[] args) {
        int data[][] = {{23, 34, 50, 21, 10},
                        {12, 22, 10, 6, 4},
                        {4, 67, 16, 40, 56},
                        {82, 85, 29, 30, 7},
                        {6, 34, 34, 45, 79}
        };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-4d", data[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int row = 0;
        int largestSum = 0;
        int largestRow = 0;
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            row = i + 1;
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
                if (sum > largestSum) {
                    largestSum = sum;
                    largestRow = row;
                }
            }
            System.out.println("Sum of Row " + row + ": " + sum);
        }
        System.out.println();
        System.out.println("The Largest Sum is Row " + largestRow + ": " + largestSum);

    }

}
