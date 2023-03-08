package MultiThreading;


class ThreadGroupClass implements Runnable
{
	//ThreadClass Constructor
	public ThreadGroupClass()
	{
		//Zero Paramterized Constructor.
	}
	
	//let's override the run method.
	@Override
	public void run()
	{
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
	}
}
public class ThreadGroupImplementationInJava {

	public static void main(String[] args) {
		
     System.out.println("               ThreadGroup Concepts in Java using Thread Class");
     //Order of Execution of Thread may not be the same at any instance of time.
     
     //Let's consider the ThreadGroup over here.
     ThreadGroup thread_group_1=new ThreadGroup("Thread Group 1");
     ThreadGroup thread_group_2=new ThreadGroup("Thread Group 2");
     ThreadGroup thread_group_3=new ThreadGroup("Thread Group 3");

     Thread thread_1=new Thread(thread_group_1,new ThreadGroupClass(),"first thread");
     thread_1.start();
     thread_1.setPriority(3);
     Thread thread_2=new Thread(thread_group_3,new ThreadGroupClass(),"second thread");
 
     thread_2.start();
     thread_2.setPriority(2);
     
     Thread thread_3=new Thread(thread_group_3,new ThreadGroupClass(),"third thread");
     thread_3.start();
     thread_3.setPriority(4);
     
     System.out.println("Thread Group for first Thread: "+thread_1.getThreadGroup());
     System.out.println("Thread Group for second Thread: "+thread_2.getThreadGroup());
     System.out.println("Thread Group for third Thread: "+thread_3.getThreadGroup());  
     
	}
}
