import java.util.Set;
import java.util.HashSet ;

public class set{
    public static void main(String args[])
    {
       Set <String> set = new HashSet <> () ;
            
            set.add("HELLO");
            set.add("HI") ;
            set.add("Welcome") ;      // does not allow duplicate
            set.add("HI") ;

            System.out.println(set) ;
            System.out.println(set.remove("HI")) ;
            System.out.println(set) ;
            System.out.println(set.contains("Hi")) ;
       
    }
}