package pattern;

import java.util.Scanner;

public class star3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the N value");
	     int n = sc.nextInt();
	     
	     for(int i=0 ; i<n ; i++)
	     {
	    	 System.out.println();
	    	 for(int j=n-i ; j>0 ; j--)
	    	 {
	    		 System.out.print("*");
	    	 }
	     }

	}

}
