
public class SB {
    
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        String hehe = "bb ibb";
        builder.append(hehe);
        // for (int i = 0; i < 26; i++) {
        // }
        System.out.println(builder.toString().replaceAll("\\s+", ""));


        if (hehe.replaceAll("\\s+", "").equals(builder.reverse().toString().replaceAll("\\s+", ""))) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }

}
