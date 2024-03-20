import java.util.*;

public class coll
{
    public static void main(String [] args)
    {
        List<Integer> li = new ArrayList<>() ;
        li.add(5);
        li.add(4);
        li.add(3);

       System.out.println(li) ;
       li.remove (1);
        System.out.println(li) ;
        li.get(1);
         System.out.println(li) ;

       List<Integer> lli = new LinkedList<>() ;
       lli.add(2) ;
       lli.add(1) ;

       System.out.println(lli) ;
       lli.remove(1);
        System.out.println(lli) ;
        li.get(0) ;
         System.out.println(lli) ;

       Map<String,Integer> map = new HashMap <> ();
       map.put("mohan",21);
       map.put("raj",21);

       System.out.println(map) ;

       Map<String,Integer> map1 =new LinkedHashMap <> ();
       map1.put("Hello",1);
       map1.put("hi",2);


       System.out.println(map1) ;

       map1.remove("hi");
        System.out.println(map1) ;
        // System.out.println(map1.contains("Hello")) ;

       Map<String,Integer> map2 = new TreeMap <> () ;
       map2.put("pp",11);
       map2.put("aa",12);

       System.out.println(map2) ;
        System.out.println(map2.get("aa")) ;

       Set<Integer> set = new HashSet<>();
       set.add (5);
       set.add(7) ;

       System.out.println(set) ;

       Set<Integer> set1 = new LinkedHashSet<>();
       set1.add(6);
       set1.add(2);

       System.out.println(set1) ;

       Set<Integer> set2 = new TreeSet<>();
       set2.add(5);
       set2.add(2);
       set2.add(1);
       
       System.out.println(set2) ;
        
        set2.remove(2);
         System.out.println(set2) ;
          //System.out.println(set2.get(1)) ;
          System.out.println(set2.contains(1)) ;


        
    }
}