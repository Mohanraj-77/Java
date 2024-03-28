
public class wrapper
{
    public  static void main (String args[])
    {
           int i =10;
           float f = 0.1f;       // primitive types

           Integer i1 =  Integer.valueof(i);

           int j = i1.intvalue() ;

           System.out.println(i1);
           System.out.println(j) ;
    }
}