public class SqueakyClean {
    
    static String clean(String identifier) {
        return identifier.replaceAll("\s", "_").replaceAll("\0", "ctrl".toUpperCase()).split("-")[1];
    }

}
