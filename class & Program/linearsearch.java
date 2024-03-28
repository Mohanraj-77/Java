package pattern;
import java.util.Scanner ;

public class linearsearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value to search: ") ;
		int key = sc.nextInt() ;
		int index=-1;
		
		int arr[] = {10,20,30,45,30,50} ;
		
		for(int i=0 ;i<arr.length ;i++)
		{
			if(arr[i] == key)
			{
				index = i ;
				break ;
			}

		}
		
		System.out.println(index) ;
		
		

	}

}
