public class array
{
    public static void main(String args[])
    {
        int num [] = {1,2,3,4,5} ;
        int sum = 0 ; 
        float avg = 0f;
        int large = num [0] ;
        

        System.out.println("Third element : " + num[3]) ;
        System.out.println("num length : "    +num.length) ;
        num[1] = 10 ;
        for (int i =0 ; i<num.length ; i++)
        {
        System.out.println("Modified array : " +num[i]); } // num[] = { 1,10,3,4,5}

        for ( int i=0 ; i<num.length ; i++)
        {
            sum = sum + num [i] ;
            avg = (sum / num.length) ;
            if(num[i] > large)
            {
                large = num[i] ;
            }
        }
         int small = num[0] ;
          int num1[] = new int [ num.length] ;
        for(int i= 0 ; i<num.length ; i++)
        {
             if(num[i] < small )
             {
                small = num [i] ;
             }

             num1 [i] = num[i] ;
        }

        System.out.println("Sum : " + sum) ;
        System.out.println("Avg : " + avg) ;
        System.out.println("Maximum number : " + large ) ;
        System.out.println("Minimum number : "  + small) ;
        System.out.println("Copy arr: num1[] ") ;
        for(int i =0 ; i<num1.length ; i++)
        {
        System.out.println(num1[i]) ; }

        System.out.println("Reversed array") ;
        
       int  start = 0;
       int  end = num.length-1 ;
        for(int i=0; i<num.length ;i++)
        {
            if(start < end)
            {
            int temp = num[start];
               num[start] =num [end] ;
               num[end] = temp ;    
               start ++ ;
               end -- ;
            }
        }
         
         for(int i = 0 ; i<num.length ; i++)
         {
        System.out.println(num[i]) ; } ;
        
        int c=0 ;
        for(int i = 0 ; i<num.length ; i++)
        {
            if (num[i] == 6)
            {
                System.out.println("Found") ;
            }
            else 
            {
                c=1 ;
             }
        }
           if(c==1)
           System.out.println("Not Found") ;
       
        
        




    }
}