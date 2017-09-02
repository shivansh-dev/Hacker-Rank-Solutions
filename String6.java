import java.lang.reflect.Array;
import java.util.Scanner;

public class String6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if(s.length()!=0) {
        	String[] tokens=s.split("[ !,'_@?.]+");
            int lenOfTokens=Array.getLength(tokens);
            System.out.println(lenOfTokens);
            for(int i=0;i<lenOfTokens;i++) {
            	System.out.println(tokens[i]);
            }
        }
        else {
        	System.out.println("0");
        }
        scan.close();
    }
}
