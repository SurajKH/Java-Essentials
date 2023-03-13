package DesignPatterns;


//creation of abstract class.
abstract class FoodStore
{
	public abstract void getStatus();
	
	public void details()
	{
		//implementation of details function.
		System.out.println("\nCategory:Food");
		System.out.println("Edible:Yes");
	}
}

class Pizza extends FoodStore
{

	@Override
	public void getStatus() {

		System.out.println("\nClass :"+this.getClass());
		String ingredientsDescrption[]={"Cheese,Pizza Dough,Tomato,Onion"};
		System.out.println("Ingredients:");
		for(int i=0;i<ingredientsDescrption.length;i++)
		{
			System.out.print(ingredientsDescrption[i]+" ");
		}
		
	}
	
}

class Burger extends FoodStore
{
	@Override
	public void getStatus()
	{
		System.out.println("\nClass :"+this.getClass());
		String ingredientsDescrption[]={"Cheese,Bun,Ketchup,Cucumbers"};
		System.out.println("Ingredients:");
		for(int i=0;i<ingredientsDescrption.length;i++)
		{
			System.out.print(ingredientsDescrption[i]+" ");
		}
	}
}

class FoodFactory
{
	public static FoodStore Instantiate(String foodItem)
	{
		//now based on the FoodItem we instantiate and further return the foodItem.
		
		if(foodItem=="Pizza")
		{
			FoodStore pizza=new Pizza();
			return pizza;
		}
		if(foodItem=="Burger")
		{
			FoodStore burger=new Burger();
			return burger;
		}
		return null;
		
	}
}

public class FactoryDesignPatternImplementationInJava {

	public static void main(String[] args) {

		System.out.println("                    Factory Design Pattern in Java");
		System.out.println();
		FoodStore pizza=FoodFactory.Instantiate("Pizza");
		System.out.println("Pizza: ");
		pizza.details();
		pizza.getStatus();
		FoodStore burger=FoodFactory.Instantiate("Burger");
		System.out.println();
		System.out.println();
		System.out.println("Burger:");
		burger.details();
		burger.getStatus();
		
	}

}
