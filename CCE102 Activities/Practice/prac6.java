package Practice;

public class prac6 {
    
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

        int column = 0;
        int largestSum = 0;
        int largestColumn = 0;
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            column = i + 1;
            for (int j = 0; j < data[i].length; j++) {
                sum += data[j][i];
                if (sum > largestSum) {
                    largestSum = sum;
                    largestColumn = column;
                }
            }
            System.out.println("Sum of Row " + column + ": " + sum);
        }
        System.out.println();
        System.out.println("The Largest Sum is Row " + largestColumn + ": " + largestSum);

    }

}
