package Day_2;

public class name {
    public static void main(String[] args) {
        System.out.println("Golu Kumar");
        String name = "Golu Kumar";
        System.out.println("Length of name is: " + name.length());
        System.out.println("Character at index 5 is: " + name.charAt(5));
        System.out.println("Substring from index 5 to 8 is: " + name.substring(5, 8));

        String res = new StringBuilder(name).reverse().toString();
        int n = name.length();
        for (int i=n-1; i >=0; i--){
            res += name.charAt(i);
        }
        System.out.println("/nRversed ame is: " + res);

    }

    // WAP to count total no of words in a string input by user
    // WAP to find first and last non repeating character in a string
    // WAP to to input S1 and S2 and check if S2 is substing of S1 or not
    // There are 2 encrytped strings that are valid only if characters follow the same pattern - same length and same frequency of characters
    // Final vs Finally
    // Functions working 
    // OOPs 
    // Inheritance


    // Storage Class - AUto, extern, static, register
    // Intializing value
    // Scope - Lifetime





}
