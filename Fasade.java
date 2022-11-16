import obfuscation.*;

public class Fasade {

    public static String getObfuscatedPassword(String prompt) {
        final java.util.Scanner stdin = new java.util.Scanner(System.in);
        System.out.print(prompt + ": ");

        return ToBinary.toBinary(
                ToAscii.process(
                    UpperCaseFirst.process(
                        ToLazyCase.process(
                            Shortener.process(
                                Filler.process(
                                    Strip.process(
                                        CrazyCase.process(
                                            stdin.nextLine()
        ))))))));
    }

}
