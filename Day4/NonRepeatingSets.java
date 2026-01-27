package Day4;
import java.util.HashSet;
import java.util.Scanner;
public class NonRepeatingSets {
    
    public static void main(String[] args) {
        // WAP to find first and last non repeating character in a string using Sets

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (set1.contains(c)){
                set1.remove(c);
                set2.add(c);
            }else if (!set2.contains(c)){
                set1.add(c);
            }
        }

        Character firstNonRepeating = null;
        Character lastNonRepeating = null;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (set1.contains(c)){
                firstNonRepeating = c;
                break;
            }
        }
        for (int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if (set1.contains(c)){
                lastNonRepeating = c;
                break;
            }
        }
        if (firstNonRepeating != null){
            System.out.println("First non repeating character is: " + firstNonRepeating);
        }else{
            System.out.println("No non repeating character found");
        }

        if (lastNonRepeating != null){
            System.out.println("Last non repeating character is: " + lastNonRepeating);
        }else{
            System.out.println("No non repeating character found");
        }

        sc.close();

    }

}


