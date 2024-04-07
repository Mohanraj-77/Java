package thread;

class school implements Runnable
{
	public void run()
	{
		System.out.println("new"+ Thread.currentThread().getId());
		try
		{
			Thread.sleep(1000);
		
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("old"+ Thread.currentThread().getPriority());
		 
	}
}



public class multithreading {

	public static void main(String[] args) {
		for(int i=1;i<4;i++)
		{
			school obj = new school() ;
			Thread obj1 = new Thread (obj) ;
			obj1.start() ;
		}

	}

}
