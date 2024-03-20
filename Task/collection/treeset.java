
import java.util.Set;
import java.util.TreeSet;
public class treeset
{
    public static void main(String args[])
    {
    Set <Integer> num = new  TreeSet  <> ()  ;
       num.add(5);
       num.add(1);         // Maintains Sorted order
       num.add(4);
       num.add(3);
       num.add(2);

       System.out.println(num) ;
       System.out.println(num.remove(3)) ;
       System.out.println(num);
       System.out.println(num.contains(3));
       System.out.println(num.contains(2));
    }
}