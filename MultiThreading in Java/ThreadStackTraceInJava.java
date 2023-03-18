package MultiThreading;

import java.util.Set;

class ThreadStackTrace extends Thread
{
	@Override
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Thread Name: "+Thread.currentThread().getName());
			System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
			System.out.println("Thread State: "+Thread.currentThread().getState());
		}
	}
}

public class ThreadStackTraceInJava {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("\t\t\t\tThread Stack Trace in Java");
		System.out.println();
		System.out.println();
		ThreadStackTrace thread_1=new ThreadStackTrace();
		ThreadStackTrace thread_2=new ThreadStackTrace();

		
		Set<Thread>threadInfo=Thread.getAllStackTraces().keySet();

   
         for (Thread t:threadInfo) 
         {
           System.out.println("Thread :"+t+ ":"+ "Thread status : "+t.getState());
         }
		
	}

}
