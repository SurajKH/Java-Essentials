package MultiThreading;

class RunnableInterfaceClass implements Runnable
{
	Thread t;
	String threadName;
	public RunnableInterfaceClass(String threadName)
	{
		//System.out.println("RunnableInterface Class Constructor");
		//Zero Paramterized Constructor.
		this.threadName=threadName;
		t=new Thread(this,threadName);
		//start the thread by seting the thread priority over here.
		//NORMAL PRIORITY : 5.
		t.setPriority(3);
		t.start();
		
	}

	@Override
	public void run() {
		System.out.println("Thread Name: "+t);
		//how can we change the thread priority.
		
		System.out.println("Thread Priority: "+t.getPriority());
	}
	
}

public class RunnableInterfaceInJava {

	public static void main(String[] args) {
		
		System.out.println("Threading Concepts in Java Using Runnable Interface.");
	     System.out.println("Inside the Main thread");
		RunnableInterfaceClass thread_1=new RunnableInterfaceClass("First Thread");
		thread_1.run();
		RunnableInterfaceClass thread_2=new RunnableInterfaceClass("Second Thread");
		thread_2.run();
	    System.out.println("Execution of Main Thread is Completed.");


	}

}
