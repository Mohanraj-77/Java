package pattern;
import java.util.Scanner;

public class star1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int n = sc.nextInt();
		
		for(int i =0 ;i<n ; i++)
		{
			
			for(int j = 0 ; j<n ; j++)
			{
				System.out.print(i+" "+j+" ");
			}
			  
			System.out.println("") ;
		}

	}

}
