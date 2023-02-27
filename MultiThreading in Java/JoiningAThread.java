package MultiThreading;

class ThreadClassImplementation extends Thread
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
public class JoiningAThread {

	public static void main(String[] args) {
		
		System.out.println("             Joining a Thread in Java MultiThreading");
		System.out.println("Current Running Thread: "+Thread.currentThread().getName());
		ThreadClassImplementation t1=new ThreadClassImplementation();
		ThreadClassImplementation t2=new ThreadClassImplementation();
		t1.start();
		//once t1 completes the task then t2 starts executing over here.
		//join() has to placed in the try and catch block.
		try
		{	
           t2.join();
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Exception has Occurred.....");
			
		}
		
		System.out.println("Current Thread:"+Thread.currentThread().getName()+" got Over...");
	}

}
