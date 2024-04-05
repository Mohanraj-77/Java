package pattern;

class PasswordException extends Exception 
{
	public void CheckPassword(String password) throws PasswordException
	{
		if(password.equals("Mohan@23"))
		{
			System.out.println("You are logged in") ;
		}
		
		else
			
			throw new PasswordException() ;
	}
}

public class mailexception {

	public static void main(String[] args) throws Exception{
		
		PasswordException Pass = new PasswordException ();
		Pass.CheckPassword("Mohan@23") ;

	}

}
