package Day4;

import java.util.Scanner;

public class reverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

// Reverse each word in a string
// Input: "Hello World"
// Output: "olleH dlroW"
        // String[] words = s.split(" ");
        // StringBuilder result = new StringBuilder();

        // for (String word : words) {
        //     StringBuilder reversedWord = new StringBuilder(word);
        //     result.append(reversedWord.reverse().toString()).append(" ");
        // }
        // System.out.println(result.toString().trim());

        String res = "";
        int j = 0;
        for (int i=0; i<=s.length(); i++){
            if (i == s.length() || s.charAt(i) == ' '){
                for (int k=i-1; k>=j; k--){
                    res += s.charAt(k);
                }
                if (i != s.length()){
                    res += ' ';
                }
                j = i + 1;
            }
        }
        System.out.println(res);

        sc.close();
    }
}
