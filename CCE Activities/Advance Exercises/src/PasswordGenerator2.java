import java.util.Random;

public class PasswordGenerator2 {

    public static void main(String[] args) {
        for (int a = 0; a < 20; a++) {

            StringBuilder builder = new StringBuilder();
            Random rand = new Random();
            String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String numbers = "0123456789";
            int lowerCaseCount = 0;
            int upperCaseCount = 0;
            int digits = 0;

            while (builder.length() < 8) {

                int randCase = rand.nextInt(2); // 0 - lowerCase; 1 - upperCase
                int letterOrDigit = rand.nextInt(2); // 0 - letter; 1 - numbers
                int randLetter = rand.nextInt(letters.length());
                int randNumber = rand.nextInt(numbers.length());

                if (letterOrDigit == 0) {

                    // Condition
                    if (randCase == 0 && lowerCaseCount < 5) {
                        letters = letters.toLowerCase();
                    } else if (randCase == 1 && upperCaseCount < 1) {
                        letters = letters.toUpperCase();
                    } else {
                        letters = letters.toLowerCase();
                    }

                    // Counts lowerCase and upperCase letters
                    if (Character.isLowerCase(letters.charAt(randLetter))) {
                        lowerCaseCount += 1;
                    } else {
                        upperCaseCount += 1;
                    }

                    builder.append(letters.charAt(randLetter));

                }

                if (letterOrDigit == 1 && digits < 2) {

                    builder.append(numbers.charAt(randNumber));
                    digits++;

                }
                

            }

            System.out.println("Here is your password: " + builder);

        }
    }

}