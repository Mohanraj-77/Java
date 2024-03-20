import java.util.LinkedList ;
import java.util.List ;
import java.util.Iterator ;

public class linkedlist
{
    public static void main(String args[])
    {
        List<Integer> num = new LinkedList <>() ;

        num.add(1);
        num.add(2);
        num.add(3);                    //Maintain insertion order
        num.add(4);                    // Allow duplicate
        num.add(2);
        
        System.out.println(num) ;

        num.remove(2) ;
        System.out.println(num) ;

        System.out.println(num.get(2)) ;

        System.out.println(num.size()) ;

        System.out.println("Iterator using while loop") ;

        Iterator  iter = num.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next()) ;
        }
        System.out.println("************************") ;
        for(Integer number : num)
        {
            System.out.println(number) ;
        }




    }
}