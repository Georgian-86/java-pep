package Day4;


import java.util.Scanner;

public class patternMatching {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String pattern = sc.nextLine();

            int m = text.length();
            int n = pattern.length();
            boolean flag;
            
            for (int i=0; i<=m-n; i++){
                flag = true;
                for (int j=0; j<n; j++){
                    if (text.charAt(i+j) != pattern.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Pattern found at index " + i);
                    return;
                }
            } 

            System.out.println("Pattern not found");
            sc.close();
    }
}


// WAP to count vowels and consonants in a string - optimus4586prime@gmail.com
// WAP to check if a string is palindrome or not ignoring spaces and special characters
// Compress the string - aaabbccdaa -> a3b2c2d1a2
// WAP to check if 2 strings are anagram of each other


