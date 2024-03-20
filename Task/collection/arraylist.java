import java.util.List ;
import java.util.ArrayList;
import java.util.Arrays;

public class arraylist 
{
    public static void main(String args[])
    {
        Integer arr[] = {1,2,3,4};
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(arr)) ;
        List <String> obj = new ArrayList <> () ;
        obj.add("Pen") ;
        obj.add("Pencil") ;
        obj.add("Paper") ;          // Maintain insertion order
        obj.add("Apsara") ;
        //obj.addall(1,2,3) ;
       

        
        
        System.out.println(obj);
        obj.remove(0);

        //System.out.println(Arrays.toString(arr));

       // System.out.println(obj.get(1)) ;
        System.out.println(obj);
        System.out.println(obj.contains("Pencil"));
        System.out.println(obj.get(2));
        //System.out.println(obj.indexof("Apsara"));
        System.out.println(obj.isEmpty());
        //System.out.println(obj.listiterator());
        //System.out.println(obj.removeAll()) ;
        System.out.println(obj.size());
        System.out.println(obj.set(0,"Pen"));
        System.out.println(obj.subList(0,2));
        




    }
}