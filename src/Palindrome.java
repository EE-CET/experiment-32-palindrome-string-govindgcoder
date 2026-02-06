import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        // convert to lower case
        S = S.toLowerCase();
        int n = S.length();
        // to check palindrome
        for(int i = 0; i<n/2; i++){
            if(S.charAt(i)!=S.charAt(n-1-i)){
                System.out.print("0");
                return;
            }
        }
        System.out.print("1");
    }   
}
