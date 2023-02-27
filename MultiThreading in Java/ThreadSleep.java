package MultiThreading;
import java.util.Scanner;

class ThreadSleepClass extends Thread
{
	@Override
	public void run()
	{
		try
		{
			System.out.println("Current Thread Name: "+Thread.currentThread().getName());
			System.out.println("Current Thread ID: "+Thread.currentThread().getId());
				//Thread sleeps for about 500 ms
				Thread.sleep(500);
			
		}
		catch(InterruptedException i)
		{
			System.out.println("Exception Occured..");
			System.out.println(i);
		}
	}
}

public class ThreadSleep{

	public static void main(String[] args) {
		
		System.out.println("                 Sleep Thread in Java MultiThreading");
		System.out.println();
		System.out.println("Executing the Main Thread.....");
		ThreadSleepClass thread_1=new ThreadSleepClass();
		ThreadSleepClass thread_2=new ThreadSleepClass();

		thread_1.start();
		thread_2.start();
		
		System.out.println("Main Thread Execution Completed...");
	}

}
