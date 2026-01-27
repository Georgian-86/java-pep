package Day4;
import java.util.Scanner;
// public class vowelsFrequency {
//     public static void main(String[] args) {
//         // WAP to count frequency of vowels and consonants in a string

//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine().toLowerCase();

//         int vowelCount = 0;
//         int consonantCount = 0;

//         for (int i=0; i<input.length(); i++){
//             char c = input.charAt(i);
//             if (c >= 'a' && c <= 'z'){
//                 if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
//                     vowelCount++;
//                 }else{
//                     consonantCount++;
//                 }
//             }
//         }

//         System.out.println("Vowels: " + vowelCount);
//         System.out.println("Consonants: " + consonantCount);
//         scanner.close();
//     }
// }



// Optimized approach using sets
// import java.util.HashSet;    
// public class vowelsFrequency {
//     public static void main(String[] args) {
//         // WAP to count frequency of vowels and consonants in a string
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine().toLowerCase();
//         HashSet<Character> vowels = new HashSet<>();
//         vowels.add('a');
//         vowels.add('e');
//         vowels.add('i');
//         vowels.add('o');
//         vowels.add('u');
//         int vowelCount = 0;
//         int consonantCount = 0;
//         for (int i=0; i<input.length(); i++){
//             char c = input.charAt(i);
//             if (c >= 'a' && c <= 'z'){
//                 if (vowels.contains(c)){
//                     vowelCount++;
//                 }else{
//                     consonantCount++;
//                 }
//             }
//         }
//         System.out.println("Vowels: " + vowelCount);
//         System.out.println("Consonants: " + consonantCount);
//         scanner.close();
//     }
// }

public class vowelsFrequency{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        int vowelCount=0;
        int consonantCount=0;

        for (int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if (c >= 'a' && c<='z'){
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowelCount++;
                }else{
                    consonantCount++;
                }
            }
        }

        System.out.println("No of vowels is: " + vowelCount);
        System.out.println("No of consonants: " + consonantCount);
        scanner.close();
    } 
}