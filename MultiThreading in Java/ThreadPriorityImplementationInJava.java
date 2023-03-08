package MultiThreading;
import java.util.Scanner;


class ThreadPriority extends Thread
{
	//ThreadClass Constructor
	int priority;
	public ThreadPriority(int priority)
	{
	  this.priority=priority;	
	}
	
	//let's override the run method.
	@Override
	public void run()
	{
		System.out.println("Thread Name: "+this.getName());
	     this.setPriority(this.priority);
		System.out.println("Thread Priority: "+this.getPriority());
	}
}
public class ThreadPriorityImplementationInJava {

	public static void main(String[] args) {
		
     System.out.println("                          Setting a Thread Priority in Java");
     //Order of Execution of Thread may not be the same at any instance of time.
     System.out.println("\nInside the Main thread.......");
     System.out.println("\nPriority:"+Thread.currentThread().getPriority());
     Scanner sc=new Scanner(System.in);
     System.out.println("\nSet a New Priority of the Thread: ");
     int priority=sc.nextInt();
     ThreadPriority thread_1=new ThreadPriority(priority);
     thread_1.start();
     System.out.println("\nExecution of Main Thread is Completed.\n");
     
	}
}
