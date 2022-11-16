package obfuscation;

public class CrazyCase {

    public static String process(final String str) {
        String crazyCased = "";
        for (int i = 0; i < str.length(); i += 1) {
            crazyCased += i % 2 == 0 ?
                    String.valueOf(str.charAt(i)).toUpperCase()
                    : String.valueOf(str.charAt(i)).toLowerCase();
        }

        return crazyCased;
    }

}
