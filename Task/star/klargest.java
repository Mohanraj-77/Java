package pattern;

import java.util.Arrays;

public class klargest {

	public static void main(String[] args) {
		
		a2();    // Another method
	    int [] arr = {5,3,7,9,10};
	    int k=2 ;
	    
	    Arrays.sort(arr);
	    
	    System.out.println(Arrays.toString(arr));
	    
	    System.out.println("K_th largest element : " +  arr[k-1]);
	    
          
	}



// Another method


	public static void a2() {
		int [] arr = {5,3,7,9,10};
		int k= 2;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr.length ; j++)
			{
				if(arr[i]< arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j] ;
					arr[j] = temp ;
				}
			}
			
			
		}
		
		
		for(int i=0 ; i<arr.length ; i++)
		{
		
		System.out.print(arr[i]);
		}
		System.out.println(" ");
		System.out.println("Kth largest number : " +arr[k-1]);
	}
		
	}
	   
