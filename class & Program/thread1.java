package thread;



class data extends Thread
      {
	public void run() {
	for(int i = 0 ; i<3 ; i++)
	{
		System.out.println("DB") ;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
      }

class num 
{
	void value () 
	{
		for(int i=1 ; i<=4 ; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class thread1 {
	
	public static void main(String[] args) {
		
           data b = new data() ;
           b.start();
           
           System.out.println("Priority " + b.getPriority()) ;          // priority is always 5.
         
           
           num n = new num() ;
           n.value() ;
           
           
	}

}
