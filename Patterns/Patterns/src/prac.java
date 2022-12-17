public class prac {

    public static void main(String[] args) {

        System.out.println("*");
        for (int i = 0; i < 4; i++) {
            for (int j = 2 - i; j >= 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("*\n");
        }

    }

}
