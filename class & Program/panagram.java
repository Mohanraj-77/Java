package pattern;

public class panagram {

	public static void main(String[] args) {
		String str ="abcDefghIjklmnopqrstuvwxYzzz    ";
		int [] list = new int[26];
		int flag = 1;
		str = str.toLowerCase() ;
		int index=0; 
		
		for(int i=0 ; i<str.length() ;i++)
		{
			if(str.charAt(i)>='a'&& str.charAt(i)<='z')
			{
				index = str.charAt(i) - 'a' ;
			}
			
			list[index] = 1 ;
		}
		
		for(int i=0 ; i<=25 ; i++)
		{
			if(list[i] == 0)
			{
				flag =0 ;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Panagram");
		}
		
		else 
		{
			System.out.println("Not a Panagram");
		}
		
		

	}

}
