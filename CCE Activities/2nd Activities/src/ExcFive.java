public class ExcFive {

    public static void main(String[] args) {
        int[][] data = {{ 23, 34, 50, 21, 10 },
                        { 12, 22, 10, 6, 4 },
                        { 4, 67, 16, 40, 56 },
                        { 82, 85, 29, 30, 7 },
                        { 6, 34, 34, 45, 79 }
        };

        System.out.println("--------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.print("|");
            for (int j = 0; j < data.length; j++) {
                System.out.printf(" %-3d|", data[i][j]);
            }
            System.out.println();
            System.out.println("--------------------------");
        }
        System.out.println();

        int largestNum = 0;
        int largestRow = 0;
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int j = 0; j < data.length; j++) {
                sum += data[i][j];
                if (sum > largestNum) {
                    largestNum = sum;
                    largestRow = i + 1;
                }
            }
            System.out.println("Sum of Row " + (i + 1) + ": " + sum);
        }

        System.out.println();
        System.out.println("The largest sum is Row " + largestRow + ": " + largestNum);
        System.out.println();
    }

}