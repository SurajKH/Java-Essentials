package MultiThreading;


class ThreadYieldClass extends Thread
{
	@Override
	public void run()
	{
			System.out.println("Current Thread Name: "+Thread.currentThread().getName());
			System.out.println("Current Thread ID: "+Thread.currentThread().getId());
			Thread.yield();
	}
}


public class YieldinThreadsImplementationInJava {

	public static void main(String[] args) {

		System.out.println("                 Yield in Thread in Java MultiThreading");
		System.out.println();
		ThreadYieldClass thread_1=new ThreadYieldClass();
		ThreadYieldClass thread_2=new ThreadYieldClass();
		//let's set the Prioirty for the Threads.
		
		thread_1.setPriority(10);
		thread_2.setPriority(2);
		
		//Note:We tend to consider  the Threads with higher Prioirity over the lower Priority Threads.
		//now we start the thread 1 and thread 2
		thread_1.start();
		thread_2.start();
		
		
	}

}
