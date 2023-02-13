public class LargestAndSmallest {

    public static void main(String[] args) {

        int[] num = { 12, 1, 43, 13, 15, 55, 65 };

        int largest = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }

        int secondLargest = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > secondLargest && num[i] < largest) {
                secondLargest = num[i];
            }
        }

        int smallest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }

        int secondSmallest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < secondSmallest && num[i] > smallest) {
                secondSmallest = num[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
        System.out.println();
        System.out.println("Smallest number: " + smallest);
        System.out.println("Second smallest number: " + secondSmallest);

    }

}
