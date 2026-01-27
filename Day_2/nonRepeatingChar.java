package Day_2;

public class nonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        char firstNonRepeatingChar = '\0';
        char lastNonRepeatingChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                firstNonRepeatingChar = ch;
                break;
            }
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                lastNonRepeatingChar = ch;
                break;
            }
        }

        System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        System.out.println("Last non-repeating character: " + lastNonRepeatingChar);
    }
}
