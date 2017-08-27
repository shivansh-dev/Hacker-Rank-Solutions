import java.util.Arrays;
import java.util.Scanner;

public class String5 {
	
	public static boolean isAnagram(String a, String b) {
		String alow=a.toLowerCase();
		String blow=b.toLowerCase();
		char[] p= alow.toCharArray();
		char[] q = blow.toCharArray();	
        Arrays.sort(p);
        Arrays.sort(q);
		
		if(Arrays.equals(p, q))
        	  {return true;
              }
        else {
        	return false;
        	}
    }

	 

	public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a,b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    
	}

}
