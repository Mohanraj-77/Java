class nameexception extends Exception
  {
    nameexception()
    {
        super("Name exception") ;
    }
  }

public class customerror
{
    public static void main(String args[])
    {
        try 
        {
            throw new nameexception() ;

        }
        catch (nameexception e)
        {
            System.out.println(e.getMessage()) ;
            e.printStackTrace() ;
        }

    }
}