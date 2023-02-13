public class ArrayExc4 {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.print("*");
        for (int i = 0; i < 4; i++) {
            String as = "**";
            for (int j = 0; j < i; j++) {
                as = as + "*";
            }
            System.out.println();
            System.out.printf("%5s", as);
        }
        System.out.println("\n");

    }

}