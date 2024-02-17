public class command
{
    public static void main (String args[])
    {
        if(args.length > 0)
        {
         
          String name = args[0] ;
            System.out.println( name);
        
        int age = Integer.parseInt(args[1]);
        System.out.println(age);
        
            if(age >=18)
            {
                System.out.println( name + " is eligible ");
            }
            else
            {
                System.out.println(name + " is not eligible");
            }
        }
        
    }
}


// public class command
// {
//     public static void main ( String args[])
//     {
//         if (args.length > 0)
//         {
//             String name = args[0] ;
//             System.out.println("NAME : " + name);

//             int age = Integer.parseInt(args[1]);
//             System.out.println("AGE : " +  age);
//         }
//     }
// }


