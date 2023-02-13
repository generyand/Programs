import java.io.SerializablePermission;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int query = scan.nextInt();

        for (int i = 0; i < query; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                a += ((int) Math.pow(2, j)) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }
}
