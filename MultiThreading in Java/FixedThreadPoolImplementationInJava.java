package MultiThreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableClass implements Runnable
{
	//let's override the run method.
	@Override
	public void run()
	{
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
	}
}

public class FixedThreadPoolImplementationInJava {

	public static void main(String[] args) {
		

        ExecutorService executor = Executors.newFixedThreadPool(3);
        //creation of two threads.  
        executor.execute(new Runnable()
        		{

					@Override
					public void run() {
						 System.out.println("Impelementing the run() method....");
						 System.out.println("Thread Name: ");
						 System.out.println(Thread.currentThread().getName());
						 System.out.println("Thread Prioirty:");
						 System.out.println(Thread.currentThread().getPriority());
					}
        	
        		});
        
        executor.execute(new Runnable()
		{

			@Override
			public void run() {
				 System.out.println("Impelementing the run() method....");
				 System.out.println("Thread Name: ");
				 System.out.println(Thread.currentThread().getName());
				 System.out.println("Thread Prioirty:");
				 System.out.println(Thread.currentThread().getPriority());
			}
	
		});
        executor.shutdown();
	}

}
