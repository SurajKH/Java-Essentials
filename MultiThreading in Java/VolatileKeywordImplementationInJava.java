package MultiThreading;

//let's keep track of the memory usage over here.
class MemoryStatus extends Thread
{
	//let's consider the initial memorySize as 100.
	static volatile int memorySize=100;
	
	@Override
	public void run()
	{
		//now we are inside the run method.
		try
		{
			//System.out.println("Memory Size is getting Updated.....");
			Thread.sleep(1000);		
			
		    //we have considered the infinite block...
		    while(true)
		    {
		    	if(memorySize>256)
				{
					System.exit(0);
					
				}
				else
				{
					//we are considering the concept of increasing the memory..
					int lower_limit=1;
					int upper_limit=100;
					int generate_random=(int) (Math.floor(Math.random()*(upper_limit-lower_limit+1))+lower_limit);
					System.out.println();
					System.out.println("\nCurrent Thread : "+Thread.currentThread().getName());
					System.out.println();
					System.out.println("Current Process Size:"+generate_random);
					memorySize+=generate_random;
					System.out.println();
					System.out.println("Memory Size  is: "+memorySize);
				}	
		    }
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Message: "+e.getMessage());
		}
		
	}
}

class MemoryThread extends Thread
{
	
}

public class VolatileKeywordImplementationInJava {

	public static void main(String[] args) {
		
	  System.out.println("\t\t\t Volatile Keyword in Java");	
      MemoryStatus m=new MemoryStatus();
      
      Thread t1=new Thread(m);
      Thread t2=new Thread(m);
      t1.start();
      t2.start();
	}

}
