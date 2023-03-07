package FunctionalProgrammingInJava;

public class SeiveGeneratorClass {

	
	static void  seive_function(int number) {
		
		//let's consider the prime function.
		        boolean flag=false;
				for(int i=2;i<=Math.sqrt(number);i++)
				{
					if(number%i==0)
					{
						System.out.println("The Number: "+number+" is not a Prime...");
						flag=true;
						break;
					}
				}
				if(flag==false)
				System.out.println("The Number: "+number+" is a Prime...");

	}

}
