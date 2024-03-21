package pattern;

import java.util.Scanner;

//public class star6 {
//
//	public static void main(String[] args) {
//		 Scanner sc = new Scanner(System.in);
//	     System.out.println("Enter the N value");
//	     int n = sc.nextInt();
//		for(int i=0 ; i<n ;i++)
//		{
//			for(int j=0 ; j<n ; j++)
//			{  
//				if(j==0 || j==n-1 || i==j )
//				System.out.print("*");
//				else
//				System.out.print(" ");
//			}
//		    System.out.println("") ;
//		}
//
//	}
//
//}

public class star6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
            	if (j == 0 || j == n-1 || (i == j && j <= n / 2) || (i + j == n - 1 && j >= n / 2)) 
            	{
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
