import java.util.ArrayList;
import java.util.Scanner;

public class Doublet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> dictionary = new ArrayList<>();
        ArrayList<String> pairedWords = new ArrayList<>();
        String doublet = "";

        do {
            doublet = scan.nextLine();
            dictionary.add(doublet);
        } while (doublet != "");

        String inputWords = "";
        do {
            inputWords = scan.nextLine();
            pairedWords.add(inputWords.split(" "));;
        } while (inputWords != "");

    }
    
}