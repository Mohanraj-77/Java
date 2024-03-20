import java.util.Set;
import java.util.LinkedHashSet;
public class linkedhashset
{
    public static void main(String args[])
    {
      Set <String> li = new LinkedHashSet<>() ;
      li.add("Mohan");
      li.add("Raj");               //Maintains insertion order
      li.add("Apple");
      li.add("Cup") ;

      System.out.println(li);
      li.remove("Apple");
      System.out.println(li);
      System.out.println(li.contains("Cup")) ;
    }
}