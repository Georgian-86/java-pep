package Day4;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class NonReapeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine();
        
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        char f = '1';
        char l = '1';
        for (char c: map.keySet()){
            if (map.get(c) == 1 && f!='1'){
                f = c;
            }else if(map.get(c) == 1){
                l = c; 
            }
        }

        if (f != '1'){
            System.out.println("First non repeating character is: " + f);
        }else{
            System.out.println("No non repeating character found");
        }

        if (l != '1'){
            System.out.println("Last non repeating character is: " + l);
        }else{
            System.out.println("No non repeating character found");
        }

    sc.close();
        
    }
}
