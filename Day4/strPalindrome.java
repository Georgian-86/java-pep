package Day4;

import java.util.Scanner;

public class strPalindrome {
    public static void main(String[] args) {
        // WAP to check if a string is palindrome or not ignoring spaces and special characters

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean flag = true;
        s = s.toLowerCase();
        for (int i=0; i<s.length()/2; i++){
            if (s.charAt(i) == s.charAt(s.length()-i-1)){
                continue;
            }else{
                flag = false;

            }
        }

        if (flag == true){
            System.out.println("Given string is a plaindrome");
        }else{
            System.out.println("Given string is not a palindrome");
        }
        sc.close();
    }
}
