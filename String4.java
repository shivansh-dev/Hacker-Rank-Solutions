import java.util.Arrays;
import java.util.Scanner;

public class String4 {
  
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int lenOfS=s.length()-k+1;
        String[] subs = new String[lenOfS];
        
        for (int i=0;i<lenOfS;i++) {
        	subs[i]= s.substring(i,i+k);
        	}
        Arrays.sort(subs);

        smallest=subs[0];
        largest=subs[subs.length-1];
               
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    } 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next(); 
        int k = scan.nextInt();
        
       
   
        scan.close();
        
      
        System.out.println(getSmallestAndLargest(s,k));
    }
}
