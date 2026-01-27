package Day4;
import java.util.Scanner;
import java.util.HashMap;

// public class smallestSubstring {
//     public static void main(String[] args) {
//         // WAP to find the smallest substring containing all characters of the given string
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         StringBuilder sb = new StringBuilder("");
//         for (int i=0; i<s.length(); i++){
//             char c = s.charAt(i);
//             if (sb.indexOf(String.valueOf(c)) == -1){
//                 sb.append(c);
//             }
//         }
//         System.out.println(sb.toString());

//         sc.close();

//         // jgr-fbii-jvf
        
//     }
// }
public class smallestSubstring {
    public static void main(String[] args) {
        // WAP to find the smallest substring containing all characters of the given string
        String s = "aabbabaadcbbca";
        String p = "abc";
        int n = s.length();
        int m = p.length();

        HashMap<Character,Integer> freq = new HashMap<>();
        HashMap<Character,Integer> freq1 = new HashMap<>(freq);
        for (char c : p.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int start = 0;

        for (int i=0; i<n-m; i++){
            if (freq.isEmpty()){

            }
            char c = s.charAt(i);
            if (freq.containsKey(c)){
                int value = freq.get(c);
                if (value == 0){
                    freq.remove(c);
                }
            }
        }


    }
}

// WAP to find the largest common substring among all the strings in an array
// Input: ["geeksforgeeks", "geeks", "geek", "geeksquiz"]
// Output: "geek"

// find the largest susbstring that does not contain duplicates in a string
// Input: "abcabcbb"
// Output: "abc"

// You are given an array of strings. join all the strings to form a single string separated by a # and their ASCII Code.
// Input: ["Hello", "World", "from", "Java"]
// Output: "72#87#from#102#Java#74"

// Find all the possible permutations of a string
// Input: "abc"
// Output: ["abc", "acb", "bac", "bca", "cab", "cba"]

// WAP to find the first non-repeating character in a string
// Input: "swiss"
// Output: "w"

// Take input of a string and remove all the adjacent duplicate characters from the string
// Input: "abbaca"
// Output: "ca"