package MultiThreading;

class NotifyMethod extends Thread
{
	//let's consider the concept of NotifyClass over here..
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Thread Name: "+Thread.currentThread().getName());
			System.out.println("\nExecuting the run method of NotifyMethod");
			System.out.println("\nSend Notfication from the Current Thread: "+Thread.currentThread().getName());
			this.notify();
			System.out.println();
		}
		
	}
}
public class NotifyImplementationInJava {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("	Notify Method in MultiThreading in Java");
		
		System.out.println("\n\nCurrent Thread: "+Thread.currentThread().getName());
		String main_thread_name=Thread.currentThread().getName();
		System.out.println();
		NotifyMethod notify_thread=new NotifyMethod();
		notify_thread.setName("Notify Thread");
		
		//now let's consider other threads over here...
		notify_thread.start();
		synchronized(notify_thread)
		{
			notify_thread.wait();
			System.out.println("Thread: "+main_thread_name+" Recieved notification from "+notify_thread.getName());
			
		}
		
		
	}

}
