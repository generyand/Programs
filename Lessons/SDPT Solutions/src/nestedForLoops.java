public class nestedForLoops {

    public static void main(String[] args) {

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%70s","-------\n");
                System.out.printf("%64s |%2s \n", i, j);
            }
            System.out.printf("%70s","-------\n");
            System.out.println();
        }

    }

}