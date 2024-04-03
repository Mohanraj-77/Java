package pattern;
import java.util.Arrays;

public class string_qns {

	public static void main(String[] args) {
		 sort() ;
		 distinct() ;
		 System.out.println(" "); 
		 string() ;

	}
	
	   static void sort()
	   {
		   String str = "java" ;
		   char[] str1 = str.toCharArray();
		   
		   for(int i=0 ; i<str1.length ;i++) {
			   Arrays.sort(str1) ;
		   }
		   
		   System.out.println(str1);
	   }
	   
	   static void distinct() 
	   {
		  String str = "java"  ;
		  char[] arr = str.toCharArray();
		  int freq[] = new int [arr.length] ;
		  
		  for(int i=0 ; i<arr.length ; i++)
		  {
			  freq[i] = 1 ;
			  for(int j=i+1 ; j<arr.length ; j++)
			  {
				  if(arr[i] == arr[j])
				  {
					  freq[i]++;
					      arr[j] = '0' ;
				  }
			  }
			  
			  if(arr[i]!= '0')
			  
			  System.out.print(arr[i]) ;
		  }
	   }
	   
	   static void string ()
	   {
	   String str = "barbie";
	   char x = 'b' ;
	   char [] arr = str.toCharArray();
	   int count =0 ;                     // to increase a count prefer this instead of count array
	    
	   for(int i=0 ;i<arr.length ; i++)
	   
		   {
		      if(arr[i]==x)
		      {
			   count ++ ;
			   System.out.print(count);
		      }
		   
		   
		   else
		   {
			   System.out.print(arr[i]);
		   }
			   
	   }
	   }
	   
	   }
