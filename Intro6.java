import java.util.Scanner;

public class Intro6  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int number = scan.nextInt();
    	for(int i=1;i<=10;i++) {
    		System.out.println(number+" x "+i+ " = "+ (number*i));
    		
    	}
    	
    	
    	
    }
}