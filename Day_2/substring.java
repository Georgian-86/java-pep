package Day_2;
// WAP to to input S1 and S2 and check if S2 is substing of S1 or not


public class substring {
    public static void main(String[] args) {
        String S1 = "Hello, welcome to the world of Java programming.";
        String S2 = "Java";

        if (S1.contains(S2)) {
            System.out.println(S2 + " is a substring of S1.");
        } else {
            System.out.println(S2 + " is not a substring of S1.");
        }
    }
}
