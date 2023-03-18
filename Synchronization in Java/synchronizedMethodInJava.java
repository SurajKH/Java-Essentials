package MultiThreading;

//we make use of a class to extrend the thread over here.
class SynchronizationMethodInJava extends Thread
{
	@Override
	public synchronized void run()
	{
		System.out.println("\n\nInside the run() method.....");
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        System.out.println("Thread ID: "+Thread.currentThread().getId());
        System.out.println();        
        System.out.println("Even Number Generation:");
		for(int i=0;i<10;i+=2)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("Even Number: "+i);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println();
		 System.out.println("Odd Number Generation:");
			for(int i=1;i<10;i+=2)
			{
				try
				{
					Thread.sleep(1000);
					System.out.println("Odd Number: "+i);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
	}
}

public class synchronizedMethodInJava {

	public static void main(String[] args) {

		System.out.println("\t\t\t\tSynchronized Block in MultiThreading in Java ");
		System.out.println();
		
		SynchronizationMethodInJava sync_obj=new SynchronizationMethodInJava();
		//how can we consider the concept of synchronized block over here...
		
		Thread thread_1=new Thread(sync_obj);
		Thread thread_2=new Thread(sync_obj);
		
		thread_1.start();
		thread_2.start();

	}

}
