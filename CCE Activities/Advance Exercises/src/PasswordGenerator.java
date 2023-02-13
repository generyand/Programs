import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder();
        Random rand = new Random();
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int passLength = 8;
    
        try {
            for (int i = 0; i < passLength; i++) {
                int randCase = rand.nextInt(2);
                int randNum = rand.nextInt(35);
                if (randCase == 0) {
                    alph = alph.toLowerCase();
                } else {
                    alph = alph.toUpperCase();
                }
                builder.append(alph.charAt(randNum));
            }
        
            System.out.println("Here's your password: " + builder);
        } catch (Exception e) {
            System.out.println("Error.");
        }
        
    }

}
