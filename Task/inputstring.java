import java.util.Scanner ;
public class inputstring
{
    public static void main (String args[])

    {
        Scanner sc = new Scanner (System.in) ;
        while(true)
        {
        System.out.println("Enter the String");
        String input = sc.nextLine();
        if(input.contains("exit"))
        {
            System.out.println("String is terminated");
            break;
        }
        }
    } 
}