public class twoDimensionArray {

    public static void main(String[] args) {

        String users[][] = {
                { "David", "david123" },
                { "Alenere", "alenere123" },
                { "Hezel", "hezel123" },
                { "Jaymar", "jaymar123" }
        };

        for (int row = 0; row < users.length; row++) {
            for (int col = 0; col < users[row].length; col++){
                System.out.printf("%-10s", users[row][col]);
            }
            System.out.println();
        }

    }

    // public static void main(String[] args) {

    // String users[][] = {
    // {"David", "david123"},
    // {"Alenere", "alenere123"},
    // {"Hezel", "hezel123"},
    // {"Jaymar", "jaymar123"}
    // };
    // System.out.println(users[1][1].toLowerCase());

    // for (int i = 0; i < users.length; i++) {
    // for (int j = 0; j < users[i].length; j++) {
    // System.out.printf("%-10s", users[i][j]);
    // }
    // System.out.println();
    // }

    // int numbers[][] = new int[4][3];
    // System.out.println(numbers[0][0]);

    // }

}
