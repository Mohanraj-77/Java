public class array1{
    public static void main (String args[])
    {
        int arr[] = { 1,7,3,6,5} ;
         for(int i =0 ; i<arr.length ; i++)
         {
            for(int j=i+1; j<arr.length ;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = temp ;
                }
            }
             
             System.out.println(arr[i]) ;
         }

           System.out.println("********************************") ;
         int num1[] = {1,2,3};
         int num2[] = {4,5,6};
         int num[] = new int [num1.length+num2.length] ;

         for(int i=0 ; i<num1.length ; i++)
         {
              num[i] = num1[i] ;
              //System.out.println(num[i]) ;
         }
         
         for(int j =0 ; j<num2.length ;j++)
         {
            num[num1.length+j] = num2[j] ;
            //System.out.println(num[j]) ;
         }
         
        for(int i=0 ; i<num.length ; i++)
         {
        
             System.out.println(num[i]) ;
         }
 
         System.out.println("*********************************************") ;
         int a[] = {1,2,3,4,3,3,5};
         int count = 0 ;
         for(int i=0 ; i<a.length ; i++)
         {
            if(a[i] == 3)
            {
                count ++ ;
            }
             
         }
         System.out.println(count) ;

         System.out.println("*****************************************************") ;
         int b[] = {7,8,9,10} ;
         int index = 2 ;
         int c[] = new int [b.length-1] ;

         for(int i=0 ; i<index ; i++)
         {
             c[i] = b[i] ;
         }
         for(int j=index+1 ;j< b.length ;j++)
         {
            c[j-1] = b[j] ;
         }

         for(int i=0 ; i<c.length ; i++)
         {
            System.out.println(c[i]);
         }

         System.out.println("*****************************************************") ;
         int d[] = {7,8,9,10} ;
         int in= 2 ;
         int value = 7 ;
         int e[] = new int [d.length+1] ;

         for(int i=0 ; i<index ; i++)
         {
             e[i] = d[i] ;
             

         }
           e[in] = value ;
         for(int j=in+1 ;j< e.length ;j++)
         {
            e[j] = d[j-1] ;
         }

         for(int i=0 ; i<e.length ; i++)
         {
            System.out.println(e[i]);
         }


    }
}
