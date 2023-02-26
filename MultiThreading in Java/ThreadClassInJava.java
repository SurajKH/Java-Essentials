package MultiThreading;


class ThreadClass extends Thread
{
	//ThreadClass Constructor
	public ThreadClass()
	{
		//Zero Paramterized Constructor.
	}
	
	//let's override the run method.
	@Override
	public void run()
	{
		System.out.println("Thread Name: "+this.getName());
		System.out.println("Thread Priority: "+this.getPriority());
	}
}
public class ThreadClassInJava {

	public static void main(String[] args) {
		
     System.out.println("               Threading Concepts in Java using Thread Class");
     //Order of Execution of Thread may not be the same at any instance of time.
     System.out.println("Inside the Main thread");
     ThreadClass thread_1=new ThreadClass();
     thread_1.start();
     ThreadClass thread_2=new ThreadClass();
     thread_2.start();
     System.out.println("Execution of Main Thread is Completed.");
	}
}
