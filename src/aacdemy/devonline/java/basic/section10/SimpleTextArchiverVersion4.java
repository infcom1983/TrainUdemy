package aacdemy.devonline.java.basic.section10;

public class SimpleTextArchiverVersion4 {

    public static String digits = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*/()_+=-?<>'[]{}\\\"'\\\\|.,";

    public static void main(String[] args) {

        String source = "A".repeat(189) + "B".repeat(39) + "C".repeat(59);
        System.out.println("Source text: " + source);

        String zipped = zip(source);
        System.out.println("Zipped text: " + zipped);

        String unzipped = unzip(zipped);
        System.out.println("Unzipped text: " + unzipped);
    }

    private static String zip(String source) {
        StringBuilder result = new StringBuilder();
        char prev = source.charAt(0);
        int count = 1;
        for (int i = 1; i < source.length(); i++) {
            var current = source.charAt(i);
            if (current == prev) {
                count++;
            } else {
                zipChar(result, prev, count);
                prev = current;
                count = 1;
            }
        }
        zipChar(result, prev, count);
        return result.toString();

    }

    private static void zipChar(StringBuilder result, char prev, int count) {
        int quotient = count / digits.length();
        int remainder = count % digits.length();
        for (int i = 0; i < quotient; i++) {
            result.append(prev).append(digits.charAt(digits.length() - 1));
        }
        if (remainder != 0) {
            result.append(prev).append(digits.charAt(remainder - 1));
        }
    }

    private static String unzip(String zipped) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < zipped.length(); i += 2) {
            var ch = zipped.charAt(i);
            int count = digits.indexOf(zipped.charAt(i + 1)) + 1;
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        return result.toString();

    }
}
