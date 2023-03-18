package MultiThreading;

//let's us consider the concept of Object as Lock...
class LockClass extends Thread
{
	@Override
	public void run()
	{
		
		System.out.println("\nCurrent Thread Name and Thread State: "+Thread.currentThread().getName()+" , "+Thread.currentThread().getState());
		synchronized(this)
		{
			//System.out.println("We are Currently Using the Thread: "+Thread.currentThread().getName());
			System.out.println("\nThread: "+Thread.currentThread().getName()+" Execution is completed Successfully.");
		}
	}
}
public class ObjectsAsLocksImplementationInJava {

	public static void main(String[] args) {

		System.out.println("\t\t\t\tObject as A Lock in MultiThreading in Java");
		System.out.println();
		LockClass thread_1=new LockClass();
		thread_1.setPriority(3);
		System.out.println("Current Thread Priority: "+thread_1.getPriority());
		thread_1.start();
		LockClass thread_2=new LockClass();
		System.out.println("Current Thread Priority: "+thread_2.getPriority());
		thread_2.start();
		thread_2.setPriority(2);
		LockClass thread_3=new LockClass();
		System.out.println("Current Thread Priority: "+thread_3.getPriority());
		thread_3.start();
		thread_3.setPriority(8);
		
		
	}

}
