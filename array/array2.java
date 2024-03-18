public class array2
{
    public static void main (String args[])
    {
        int arr[] = {1,1,2,3,5,5,3} ;
        for(int i=0 ; i<arr.length ;i++)
        {
            for(int j=i+1 ; j<arr.length ;j++)
            {
                if(arr[i] == arr[j])
                {
                     System.out.println(arr[i]) ;
                }
            }
           
        }
         
         System.out.println("************************************") ;

        int arr1[] = {1,2,3,4} ;
		int k = 1;
		int temp[] = new int [arr1.length] ;
		
		for(int i =0 ; i<k ; i++)
		{
		    temp[i] = arr1[i] ;
		   // System.out.println(temp[i]) ;
		   
		}
		
		    //System.out.println("-----------") ;
		    
		   int x = k ;
		for(int i=0 ; x<arr1.length ; i++)
		{
		    arr1[i] = arr1[x++] ;
		    //System.out.println(arr1[i]) ;
		}
		   //System.out.println("-------------") ;
		   
		       x= 0 ;
		   for(int i = arr1.length - k ; i<arr1.length ; i++ )
		   {
		       arr1[i] = temp[x++] ;
		       //System.out.println(arr1[i]) ;
		   }
		      //System.out.println("--------------") ;
		      
		 for(int i = 0 ; i<arr1.length ; i++)
		 {
		     System.out.println(arr1[i]) ;
		 }
 
         System.out.println("**************************************") ;
         int num [] = {1,2,3,5} ;
         int n = num.length+1 ;

         int sum = n*(n+1) /2 ;
         System.out.println(sum) ;
        
        int actualsum = 0 ;

        for(int i=0 ;i<num.length ; i++)
        {
            actualsum = actualsum+num[i] ;
           
        }

            System.out.println(actualsum) ;

            int missing = sum - actualsum ;
            System.out.println(missing) ;
        
        System.out.println("******************************************") ;

        
           
        


    }
}