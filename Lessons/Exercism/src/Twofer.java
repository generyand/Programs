public class Twofer {
    
    public static String twofer(String name) {
        String twoFer = (name == null) ? "One for you, one for me." : "One for " + name + ", one for me.";
        return twoFer;
    }

}
