import java.util.*;

public class arr
{
    public static void main(String args[])
    {
       String [ ] arr1 = {"a","b","c","a","b","c"} ;
       System.out.println(arr1) ;

       List <String> li = new ArrayList<>(Arrays.asList(arr1)) ;
       System.out.println(li);
       
       Set <String> li = new HashSet<>();
       li.add("A");
       li.add("B");
       li.add("A") ;
       System.out.println(li);
       
    }
}