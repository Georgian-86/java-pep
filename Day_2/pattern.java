package Day_2;

public class pattern {
    public static void main(String[] args) {

        int n = 5;
        for (int i =1; i<=n; i++){
            for (int k=1; k<=i-1; k++){
                System.out.print(" ");
            }
            // System.out.print(i);
            if (i<n){
                System.out.print(i);
                for (int m=1; m<=2*(n-i)-1; m++){
                    System.out.print(" ");
                }
                System.out.print(i);
            }else{
                System.out.print(i);
            }

            System.out.println();
        }

        for (int i =n-1; i>=1; i--){
            for (int k=1; k<=i-1; k++){
                System.out.print(" ");
            }
            // System.out.print(i);
            if (i<n){
                System.out.print(i);
                for (int m=1; m<=2*(n-i)-1; m++){
                    System.out.print(" ");
                }
                System.out.print(i);
            }else{
                System.out.print(i);
            }

            System.out.println();
        }
    }


    // Home-work: Print the following pattern
    /*      A
          C B D
            E
          G F H
            I      */
            
    
}
