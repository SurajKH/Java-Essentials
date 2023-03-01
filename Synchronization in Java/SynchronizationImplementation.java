package SynchronizationInJava;

class Counter 
{
	public void counter()
	{
		for(int i=0;i<10;i++)
		System.out.println("Counter: "+i);
	}
}

class ThreadCounter extends Thread
{
	//let's consider the Counter reference over here.
	Counter c;
	
	ThreadCounter(Counter c1)
	{
		this.c=c1;
	}
	
	public void run()
	{
		synchronized(c)
		{
			c.counter();
			System.out.println("Counter has Completed the Task.");
			System.out.println("Thread Information: ");
			System.out.println("Thread Name: "+Thread.currentThread().getName());
			System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
			System.out.println("\n");
		}
	}
	
}
public class SynchronizationImplementation {

	public static void main(String[] args){
		
		System.out.println("                   Synchronization in Java MultiThreading");
		Counter c=new Counter();
		ThreadCounter thread_1=new ThreadCounter(c);
		ThreadCounter thread_2=new ThreadCounter(c);
		
		thread_1.start();
		thread_2.start();
		
		try
		{
			thread_1.join();
			thread_2.join();
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured...");
			System.out.println(e.getMessage());
		}
		

	}

}
