package MultiThreading;

import java.util.Set;

class ThreadStates extends Thread
{
	@Override
	public void run()
	{
		synchronized(ThreadStates.class)
		{
			System.out.println("\nThread Details: ");
			System.out.println();
			System.out.println("Thread Name: "+Thread.currentThread().getName());
            System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
            
            try
            {
            	System.out.println("Thread is currently sleeping for 2000ms...");
               Thread.currentThread().sleep(100);
               System.out.println("Thread get's awakened after 2000ms....");
               System.out.println("Current Thread State: "+Thread.currentThread().getState());
               //Thread.currentThread().stop();
               System.out.println("Thread Alive Status: "+Thread.currentThread().isAlive());

               
            }
            catch(Exception e)
            {
            	System.out.println(e);
            }
           // System.out.println("Thread State:");
		}	
	}
}

public class ThreadStatesImplementationInJava {

	public static void main(String[] args) {
			System.out.println("\t\t\tThread States in MultiThreading in Java");
			ThreadStates thread_1=new ThreadStates();
			ThreadStates thread_2=new ThreadStates();
			thread_1.start();
			thread_2.start();		
			
			  
	}

}
