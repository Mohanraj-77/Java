package pattern;

 class PassportException extends RuntimeException                     // if we give runtimeException here 
{
	void CheckNationality(String nationality) throws PassportException  // we cannot throw exception in main method
	{
		if(nationality.equals("india"))
		{
			System.out.println("You are eligible") ;
		}
		else
		{
			throw new PassportException() ;               // throw - class ah throw pannum 
			
		}                                                 // throws - it should be called in exception 
	}
}

public class passexception {

	public static void main(String[] args)  {
		PassportException p = new PassportException();
		p.CheckNationality("india");
//		p.CheckNationality("france");
 
	}
                                                                        // create own exception - task
}
