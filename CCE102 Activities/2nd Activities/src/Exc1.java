public class Exc1 {
    
    public static void main(String[] args) {
        int numbers[] = {12, 23, 120, 60, 320, 45, 93, 21, 60, 310};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        String sep = "";
        System.out.print("ELEMENTS: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(sep + numbers[i]);
            sep = ", ";
        }
        System.out.println("\nSUM: " + sum);
        System.out.println();
    }
}