import java.util.Scanner;

public class intro7_1 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
		for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=1;j<=n;j++) {
        		int value=seriesfinder(a,b,j);
            	System.out.print(value+" ");            	
        	}System.out.println("");
        }        
        in.close();
    }
    
    
    public static int seriesfinder(int a,int b,int n)
    {	int tempValue=a;
    	for(int i=0;i<n;i++) {
    		tempValue+=(int)(Math.pow(2,i))*b;
    	}

    	return tempValue;
    }
}