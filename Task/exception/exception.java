
class nameexception extends Exception
{
    public String name ( String name) 
    {
        if(name == "mei") 
        
         super ("Illegal  name exception") ;
    }
}


public class exception 
{
    public static void main (String args[])
    {
        try
        {
            String name = "mei" ;

        }
        catch (nameexception e)
        {
            System.out.println(e.getmessage()) ;
            System.out.println(e);
        }
    }
}