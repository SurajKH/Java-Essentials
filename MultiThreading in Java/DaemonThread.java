package MultiThreading;

class DaemonThreadClassImplementation extends Thread
{
	public void info()
	{
		System.out.println("Current Thread Information: ");
		System.out.println("Current Thread Name: "+Thread.currentThread().getName());
		System.out.println("Current Thread ID: "+Thread.currentThread().getId());
        
	}
	@Override
	public void run()
	{
		//information about the thread.
		info();
	}
}
public class DaemonThread {

	public static void main(String[] args) {

		System.out.println("          Daemon Thread in Java MultiThreading ");
		/*
		 
		 Daemon thread in Java is a low-priority thread that runs in the background to perform tasks 
		 Ex:garbage collection. 
		 Daemon thread in Java is also a service provider thread that provides services to the user thread
		 
		 */
		
		DaemonThreadClassImplementation d_thread_1=new DaemonThreadClassImplementation();
		DaemonThreadClassImplementation d_thread_2=new DaemonThreadClassImplementation();
		d_thread_1.setDaemon(true);
		
		d_thread_1.start();
		d_thread_2.start();

		System.out.println("\nDaemon Thread Status: ");
		System.out.println(d_thread_1.isDaemon());
		
		System.out.println("\nDaemon Thread Status: ");
		System.out.println(d_thread_2.isDaemon());
		
	}
}
