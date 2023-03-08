package ConcurrencyInJava;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//we need to consider the Thread Class
class ImplementingThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Inside the run method in Java");
		System.out.println("Implementing the run method of Thread Class");
	}
}

class RunnableClass implements Runnable
{

	//we are trying to consider the implementation 
	//for the abstract method over here....
	@Override
	public void run() {

		System.out.println();
		System.out.println("Inside the run method in Java");
		System.out.println("Implementing the run method of Runnable Interface....");
		System.out.println();
		
	}
	
}
public class ThreadClassWorkinginJava {

	public static void main(String args[])
	{
		ImplementingThread thread1=new ImplementingThread();
		//thread1.start();
		//we are starting the Thread...
		System.out.println();
		//creation of second thread....
		ImplementingThread thread2=new ImplementingThread();
		//thread2.start();
		
		System.out.println("                              ExecutorService Interface in Concurrency in Java");
		ExecutorService service=Executors.newFixedThreadPool(2);
		System.out.println();
		System.out.println();
		service.submit(new RunnableClass());
		
		
		service.submit(()->System.out.println("ExecutorService using the Lambda Expression in Java"));
		
		//we need to stop the service over here.
		service.shutdown();
	}
	
	
}
