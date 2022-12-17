public class prac2 {
    
    public static void main(String[] args) {

        String star = "*";

        for (int i = 0; i <= 5; i++) {
            if (i == 1) {
                System.out.print(star.replace(star, "*"));
            }

            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i; j++) {
                if (i != 1) {
                    System.out.print(star);
                }
            }
            System.out.println();
        }
        
    }

}
