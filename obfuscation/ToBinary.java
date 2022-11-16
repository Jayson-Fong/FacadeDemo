package obfuscation;

public class ToBinary {
    private int mask;
    private String str;

    public static String toBinary(String input) {

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))   // char -> int, auto-cast
                            .replaceAll(" ", "0")                         // zero pads
            );
        }
        return result.toString();
    }

    public void setMask(int mask) {
        this.mask = mask;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getMask() {
        return mask;
    }

    public String getStr() {
        return str;
    }
}
