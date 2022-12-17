public class pracs {
 
    public static void main(String[] args) {
        
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
