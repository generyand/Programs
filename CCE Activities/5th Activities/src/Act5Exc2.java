import java.util.Scanner;

public class Act5Exc2 {
    
    public static void main(String[] args) {
        // GENERAL INITIALIZATION
        Scanner scan = new Scanner(System.in);
        int n = 0;
        double sum=0.0;

        // ASK FOR THE INPUT
        System.out.println("Enter N");
        n = scan.nextInt();
        
        // PROCESS
        int i=1; // initialization of i
        while(i<=n) {
            sum+=1.0/i; // katong naa sa formula nga 1.0/1 + 1.0/2 + 1.0/3... hantod kung asa ang n
            i++; // incrementation of i
        }
        scan.close();

        System.out.println("Sum is : " + sum); // display or output ang sum

    }

}