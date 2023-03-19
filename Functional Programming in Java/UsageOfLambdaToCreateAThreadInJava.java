package LambdaInJava;

public class UsageOfLambdaToCreateAThreadInJava {

	public static void main(String[] args) {

		System.out.println("\t\t\t\tUsage Of Lambda To Create A Thread In Java");
		System.out.println("Inside the Main Thread....");
		System.out.println(Thread.currentThread().getName());
		Runnable thread_1=()->
		{
		   System.out.println("\n\nWe are Considering the Runnable Interface for Creation of Thread");
		   System.out.println(Thread.currentThread().getName());
		};
		
		Thread newThread=new Thread(thread_1);
		newThread.start();
		Runnable thread_2=()->
		{
		   System.out.println("\n\nWe are Considering the Runnable Interface for Creation of Thread");
		   System.out.println(Thread.currentThread().getName());
		};
		
		Thread newThread2=new Thread(thread_1);
		newThread2.start();
		System.out.println("\nExiting the Main Thread.....");
	}

}
