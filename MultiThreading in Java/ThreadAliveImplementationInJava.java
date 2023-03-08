package MultiThreading;

class ThreadAliveClass extends Thread
{
	//ThreadClass Constructor
	public ThreadAliveClass()
	{
		//Zero Paramterized Constructor.
	}
	
	//let's override the run method.
	@Override
	public void run()
	{
		System.out.println("Thread Name: "+this.currentThread().getName()+"  Thread Alive Status:"+this.currentThread().isAlive());
	}
}
public class ThreadAliveImplementationInJava {

	public static void main(String[] args) {
		
     System.out.println("               Thread Alive Status Concepts in Java using Thread Class");
     //Order of Execution of Thread may not be the same at any instance of time.
     System.out.println("Inside the Main thread");
     ThreadAliveClass thread_1=new ThreadAliveClass();
     thread_1.start();
     
     ThreadAliveClass thread_2=new ThreadAliveClass();
     thread_2.start();

     thread_2.suspend();
     
	System.out.println("Thread Name: "+thread_1.getName()+"  Thread Alive Status:"+thread_1.isAlive());
	System.out.println("Thread Name: "+thread_2.getName()+"  Thread Alive Status:"+thread_2.isAlive());

     System.out.println("Execution of Main Thread is Completed.");
     
     thread_1.suspend();
	}
}