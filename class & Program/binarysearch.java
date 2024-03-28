package pattern;

public class binarysearch {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int l=0;
		int r=arr.length -1 ;
		
		
		int k = 3 ;
		int result = -1 ;
		
		while(l<=r)
		{
			int mid = ((l+r) /2 ) ;

			
			if(arr[mid]== k)
			{
			  result = mid ;
				break;
			}
			else if (arr[mid]< k) 
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
		}
			
			if(result != -1)
			{
				System.out.println(result);
			}
			
			else
			{
				System.out.println("Element not found");
			}
			
		}
		
	}


