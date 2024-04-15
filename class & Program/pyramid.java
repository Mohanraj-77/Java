public class pyramid
{
    public static void main (String args[])
    {
         
        revpyramid();
        System.out.println("------------------------------------------------") ;
        pyramid();
        System.out.println("-------------------------------------------------") ;
        missingnumber();
        System.out.println("---------------------------------------------------") ;
        revarray() ;
    }



   static void revpyramid()
    {
        for(int i=5-1 ; i>=0 ;i--)
        {
            for(int j=5-i ; j>0 ; j--)
            {
                System.out.print(" ") ;
            }
            for(int j=0 ;j<=i ;j++)
            {
                System.out.print("*") ;
            }

            System.out.println() ;
        }
    }

     static void pyramid()
    {
        for(int i=0 ; i<5 ;i++)
        {
            for(int j=5-i ; j>0 ; j--)
            {
                System.out.print(" ") ;
            }
            for(int j=0 ;j<=i ;j++)
            {
                System.out.print("*") ;
            }

            System.out.println() ;
        }
    }

    static void missingnumber()
    {
        int arr[] = {1,4,3,2,5};                      // missing number in an array
    int k = (arr.length +1) * (arr.length+2 )/ 2;
    int n =0;
    int sum = 0 ;
       for(int i=0 ; i<arr.length ; i++)
       {
            sum = sum + arr[i] ;
            
             
       }
            System.out.println(k) ;
            n=k-sum ;
         
          
          System.out.println("Missing number: " + n) ;
		
    }

    static void revarray()
    {
	  int arr[] = { 1, 2 , 3 ,4,5 } ;                 // reversing an array without new array
	 
	  
	  for(int i =arr.length-1 ; i>=0 ; i--)
	  {
	      System.out.print(arr[i]) ;
	  }
	
    }
}