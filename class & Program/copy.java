package thread;

   public class copy{

	public static void main(String[] args) throws InterruptedException {
	
		        Thread thread = new Thread(() -> {
		            System.out.println("Thread started.");

		            try {
		                // Sleep for 2 seconds
		                Thread.sleep(2000);
		            } catch (InterruptedException e) {
		                System.out.println("Thread interrupted while sleeping.");
		                return; // Exit the thread
		            }

		            System.out.println("Thread resumed after sleep.");

		            // Check if the thread is interrupted
		            if (Thread.currentThread().isInterrupted()) {
		                System.out.println("Thread is interrupted.");
		            } else {
		                System.out.println("Thread is not interrupted.");
		            }
		        });

		        // Start the thread
		        thread.start();

		        // Wait for the thread to finish
		        thread.join();

		        // Check if the thread is alive
		        if (thread.isAlive()) {
		            System.out.println("Thread is still alive.");
		        } else {
		            System.out.println("Thread has finished.");
		        }

		        // Interrupt the thread
		        thread.interrupt();

		        // Check if the thread is interrupted
		        if (thread.isInterrupted()) {
		            System.out.println("Thread is interrupted after interruption.");
		        } else {
		            System.out.println("Thread is not interrupted after interruption.");
		        }
		    }
		

	}


