package ObjectOrientedProgrammingConcepts;
import java.util.*;

class BankDetails
{
	//Data Members of BankDetails Class.
	int BankAccountId;
	String BankAccountName;
	
	//Methods of BankDetails Class.
	public BankDetails(int BankAccountId, String BankAccountName)
	{
		//System.out.println("Parameterized Constructor.....");
		this.BankAccountId=BankAccountId;
		this.BankAccountName=BankAccountName;
	}
	
	public void display(int BankAccountId,String BankAccountName)
	{
		System.out.println("--------------Bank Account Details----------------");
	    System.out.println("Bank ID: "+BankAccountId);
	    System.out.println("Bank Account Name: "+BankAccountName);
		System.out.println("Details Have been Updated Successfully.");

	}
}

public class EncapsulationInObjectorientedProgramming {

	public static void main(String[] args) {
		
		System.out.println("--------------Encapsulation in Object Oriented Programming.-------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bank Details: ");
		System.out.println("Enter your Bank Account ID: ");
		int id=sc.nextInt();
		System.out.println("Enter your Bank Account Name: ");
		String name=sc.next();
		BankDetails bobj=new BankDetails(id,name);
		bobj.display(id, name);
		
	}

}
