
public class String3 {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String subs[] ;
        for (int i=0;i<s.length();i++) {
        	subs[i].append(s.substring(i,i+1));
        	System.out.println([i]);
        }
        
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();      
        
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
