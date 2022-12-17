package Practice;

public class prac11 {
    
    public static void main(String[] args) {
        int numbers[] = {23, 24, 12, 16, 12, 10, 23, 14};
        

        for (int i = 0; i <numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int duplicateIndex = 0;
                if (numbers[i] == numbers[j]) {
                    duplicateIndex = j;
                    System.out.println("Duplicate number of " + numbers[i] + " on index " + duplicateIndex);
                }
            }
            
        }
    }

}
