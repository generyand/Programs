public class ExcThree {
    
    public static void main(String[] args) {
        int numbers[] = {12, 23, 120, 60, 320, 45, 93, 21, 60, 310};
        int i;

        System.out.print("Elements: ");
        String sep = "";
        for (i = 0; i < 8; i += 2) {
            System.out.print(sep + numbers[i]);
            sep = ", ";
        }
        
        System.out.println("\n");
    }

}