package MultiThreading;

//Multi Tasking.
class Task1Implementation extends Thread
{
	@Override
	public void run()
	{
		System.out.println("\nImplementation of Task 1");
		System.out.println("Current Thread:"+Thread.currentThread().getName());
	}
}

class Task2Implementation extends Thread
{
	@Override
	public void run()
	{
		System.out.println("\nImplementation of Task 2");
		System.out.println("Current Thread:"+Thread.currentThread().getName());
	}
}
public class MultiTasking {

	public static void main(String[] args) {
		System.out.println("                   MultiTasking in Java");
		System.out.println("Current Thread: "+Thread.currentThread().getName());
		//Creation of Threads
		Task1Implementation task1_thread=new Task1Implementation();
		Task2Implementation task2_thread=new Task2Implementation();
		
		task1_thread.start();
		task2_thread.start();
		

	}

}
