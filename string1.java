import java.util.Scanner;

public class string1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lensum = A.length()+B.length();
        System.out.println(lensum);
        /* Enter your code here. Print output to STDOUT. */
        int lex= A.compareTo(B);
        if(lex>0) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        String result = String.valueOf(A.charAt(0)).toUpperCase()+
        		A.substring(1).toLowerCase()+ " " + String.valueOf(B.charAt(0)).toUpperCase()+
        		B.substring(1).toLowerCase();
        System.out.println(result);
        
    }
}