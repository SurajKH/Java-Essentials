interface VehicleInterface
{
	//this can be considered as an abstract method present inside the VehicleInterface.
	void drive();
}

interface ParkingCharges
{
	//this can be considered as an abstract method present inside the ParkingChargesInterface.
	int cost(int noofHours,int VehicleType);
}
public class LambdaImplementationInJava {

	public static void main(String[] args) {
		
		System.out.println("                   Lambda Expressions in Java");
		System.out.println();
		System.out.println("Interface:VehicleInterface");
		System.out.println();
	    VehicleInterface MotorCycle= () -> System.out.println("We are Able to drive the MotorCycle...");
	    MotorCycle.drive();
	    
	    System.out.println();
	    System.out.println();
	    System.out.println("Interface:ParkingCharges");
	    ParkingCharges ParkingPrice=(int no_of_hours,int Vehicle_type)->
	    		{
	    			System.out.println("\nCost Generation Function...");
	    			System.out.println("\nCost is Being Calaculated.....");
	    			int res=0;
	    			//
	    			switch(Vehicle_type)
	    			{
	    			case  0:
	    				   res=no_of_hours*40;
	    				   break;
	    			case 1:
	    				   res=no_of_hours*80;
	    				   break;	   
	    			}
					return res;
	    	         
	    		};
	    int price=ParkingPrice.cost(4, 0);
	    System.out.println("\nCost is: "+price);
	    
       
	}

}
