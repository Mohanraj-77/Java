package pattern;

import java.util.*;
public class ass1 {

	public static void main(String[] args) {
		 
		
		
		System.out.println("Student 1 :  Mohan") ;
		
		
		ArrayList <String> n1 = new ArrayList<>();
		 n1.add("Maths");
		 n1.add("Science");
		 n1.add("English");
		 n1.add("Tamil") ;
		 n1.add("Social") ;
		 
		 System.out.println("Subjects : " + n1);
		 
		 ArrayList <Integer> n2 = new ArrayList <>();
		 n2.add(70);
		 n2.add(80);
		 n2.add(90);
		 n2.add(85);
		 n2.add(80);
		 
		 System.out.println("Marks : " + n2);
		 
		 int sum = 0 ;
		 
		 for(Integer num:n2)
		 {
			  sum += num ;
			
		 }
		 
		 System.out.println("Total : " + sum);	
		 
		 System.out.println(" ") ;
		 
		 System.out.println("Student 2 :  Raj ") ;
			
			
			ArrayList <String> n3 = new ArrayList<>();
			 n3.add("Maths");
			 n3.add("Science");
			 n3.add("English");
			 n3.add("Tamil") ;
			 n3.add("Social") ;
			 
			 System.out.println("Subjects : " + n3);
			 
			 ArrayList <Integer> n31 = new ArrayList <>();
			 n31.add(80);
			 n31.add(80);
			 n31.add(95);
			 n31.add(90);
			 n31.add(80);
			 
			 System.out.println("Marks : " + n31);
			 
			 int sum1 = 0 ;
			 
			 for(Integer num:n31)
			 {
				  sum1 += num ;
				
			 }
			 
			 System.out.println("Total : " + sum1);	 

          HashMap<String,Integer> hash = new HashMap<>();
          hash.put("Maths",80);
          hash.put("English", 90) ;
          hash.put("Science", 85) ;
          
          System.out.println(" ") ;
          System.out.println(hash) ;
          
          System.out.println(hash.keySet()) ;
          System.out.println(hash.values()) ;
          
          //System.out.println(hash.get("Maths")) ;
          
          
          int tot = 0;
        for(Integer n :hash.values())     {
      	     tot += n ;
         }
        System.out.println(tot) ;
          

	}

}
