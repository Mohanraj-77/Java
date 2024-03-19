public class variable_1
{
     
    public static void main(String args[])
    {
        double length = 5.5 , width = 2.5 ;
        int num2 = 20;
        boolean ispositive = (num2>0);
        String name = "JOE" ;
        String greeting =("Hello"+ name);
        int TotalStudents = 100 ;
        boolean isLeapyear = (2025 %4 == 0);
        double price1 =10.50 , price2 = 20.75 ;
        char grade ='o';
        double hoursWorked = 40.5 , hourlyRate = 15.0;
        // boolean isprime(num3) 
        // {   
        //    int  flag = 0;
        //     for(i=2;i<=num3;i++)
        //     {
        //         if(num3 % i == 0)
        //         flag = 1;
        //     }
        //     if(flag == 0)
        //      return prime ;
        //     else
        //      return notaprime ;
        // }
        int num3 = 3;
        boolean isprime = (num3 % 2 !=0 || num3 == 2);

        boolean isVowel = ( grade == 'a' || grade == 'e' || grade == 'i' || grade == 'o' || grade == 'u');


        String str = "madam";
        boolean ispalindrome = (str == "madamn");


        
     
       
    

        System.out.println(length );
        System.out.println(width);
        System.out.println(ispositive);
        System.out.println(greeting );
        System.out.println(TotalStudents);
        System.out.println(isLeapyear);
        System.out.println(price1);
        System.out.println(price2 );
        System.out.println(hoursWorked );
        System.out.println(hourlyRate );
        System.out.println(isVowel);
        System.out.println(isprime);
        System.out.println(ispalindrome);
        
    }
}