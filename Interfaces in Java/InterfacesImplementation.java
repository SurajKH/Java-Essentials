interface Vehicle
{
	//methods inside Interface.
	void detect_movement();
}

//We tend to Consider the MotorCycle Class which implements the Interface.
//Note:It is mandatory to implement all the methods defined inside the Vehicle Interface over here.
class MotorCycle implements Vehicle
{

	@Override
	public void detect_movement() {

		System.out.println("\nClass:"+this.getClass());
		System.out.println("\nMotorCycle Starts Moving....\n");
	}
	
}

class Car implements Vehicle
{
	@Override
	public void detect_movement()
	{
		System.out.println("\n\nClass"+this.getClass());
		System.out.println("\nCar Starts Moving....");
	}
}

public class InterfacesImplementation {

	public static void main(String[] args) {

		System.out.println("                             Interface in Java");
		System.out.println();
		System.out.println("Motorcycle Class Implements the Vehicle Interface:");
		MotorCycle  mc=new MotorCycle();
		mc.detect_movement();
		
		
		System.out.println("Car Class Implements the Vehicle Interface:");
		Car c=new Car();
		c.detect_movement();
		
		
		
		
	}

}
