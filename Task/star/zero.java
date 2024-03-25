package pattern;

import java.util.Arrays;

public class zero {

	public static void main(String[] args) {
		int arr[] = {0,1,0,5,0,3,0,2};
		for(int i=1 ; i<arr.length ; i++)
		{
			int n=i;
			int j=i-1;
			
			while(j>=0)
			{
				if(arr[n]==0 && arr[j]!=0)
				{
					int temp=arr[n];
					arr[n] = arr[j];
					arr[j] = temp ;
					n--;
					j--;
				}
				else
					
					break ;
				
			}
			
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
