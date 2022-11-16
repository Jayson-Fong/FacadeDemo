package obfuscation;

public class ToAscii {

    public static String process(final String str) {
        String asciified = "";
        for (int i = 0; i < str.length(); i += 1) {
            asciified += String.valueOf((int) str.charAt(i));
        }

        return asciified;
    }

}
