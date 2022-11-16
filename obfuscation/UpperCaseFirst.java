package obfuscation;

public class UpperCaseFirst {

    public static String process(final String str) {
        if (str.length() == 1) {
            return str.toUpperCase();
        }

        return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1);
    }

}
