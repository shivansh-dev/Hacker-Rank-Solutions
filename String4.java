import java.util.Scanner;

public class String5 {

	    public static void main(String[] args) {
	        
	    	Scanner sc=new Scanner(System.in);
	        String str = sc.next();
	        StringBuffer A= new StringBuffer(str);
	        StringBuffer B= new StringBuffer(str);
	        B.reverse();
	        if(A.toString().compareTo(B.toString())==0)
	        {
	        	System.out.println("Yes");
	        }
	        else
	        { System.out.println("No");
	        }
	        
	        
	    }
	
}
