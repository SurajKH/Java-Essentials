interface VehicleInterface
{
	//methods inside Interface.
	public void detect_movement();
	
	//default Method.
	default void display()
	{
		System.out.println("\nDefault Method inside Vehicle Interface\n");
	}
}

//We tend to Consider the MotorCycle Class which implements the Interface.
//Note:It is mandatory to implement all the methods defined inside the Vehicle Interface over here.
class MotorCycleClass implements VehicleInterface
{

	@Override
	public void detect_movement() {

		System.out.println("\nClass: "+this.getClass());
		System.out.println("\nMotorCycle Starts Moving....\n");
	}
	
}

class CarClass implements VehicleInterface
{
	@Override
	public void detect_movement()
	{
		System.out.println("\n\nClass: "+this.getClass());
		System.out.println("\nCar Starts Moving....");
	}
}
public class defaultKeywordinInterfaceImplementation {

	public static void main(String[] args) {
		
       
		System.out.println("                             Interface in Java");
		System.out.println();
		System.out.println("Motorcycle Class Implements the Vehicle Interface:");
		
		MotorCycleClass  mc=new MotorCycleClass();
		mc.detect_movement();
		mc.display();
		
		
		System.out.println("\n\nCar Class Implements the Vehicle Interface:");
		CarClass c=new CarClass();
		c.detect_movement();
	    c.display();
	}

}
