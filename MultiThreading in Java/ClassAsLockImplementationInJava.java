package MultiThreading;

class Lock extends Thread
{
	public void run()
	{
		
		synchronized(Lock.class)
		{
			System.out.println();
			System.out.println("We are Currently Using the Thread: "+Thread.currentThread().getName());
			System.out.println("\nThread: "+Thread.currentThread().getName()+" Execution is completed Successfully.");
			System.out.println();
		}
	}
}
public class ClassAsLockImplementationInJava {

	public static void main(String[] args) {

		System.out.println("\t\t\t\tClass Lock Implementation in MultiThreading in Java");
		System.out.println();
		
		Lock lobj1=new Lock();
		Lock lobj2=new Lock();
		lobj1.start();
		lobj2.start();
		
	}

}
