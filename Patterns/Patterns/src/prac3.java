public class prac3 {
    
    public static void main(String[] args) {

        System.out.println("*");
        for (int count = 4; count > 0; count--) {
            for (int col = 0; col < count - 1; col++) {
                System.out.print(" ");
            }
            for (int row = 5; row > count - 1; row--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}
