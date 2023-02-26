import java.util.Stack;
import java.util.Scanner;

public class StackInJava {

	public static void main(String[] args) {
		
		System.out.println("         Stack in Java");
		Stack<Integer> st=new Stack<>();
		System.out.println("Enter the size of Elements in the Stack: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i+=2)
		{
			
			st.add(i*10);
		}
		System.out.println("\nStatus of Stack: ");
		if(st.empty())
		{
		System.out.println("Stack is Empty.");
		}
		else
		{
			System.out.println("Stack is not Empty.");
		}
		System.out.println("\nThe Top of the Stack: "+st.peek());
		Stack<Integer> cloned_stack=(Stack<Integer>) st.clone();
		
		Stack<Integer> reverse_stack=new Stack<Integer>();
		System.out.println("Elements present in the Stack: ");
		while(!st.empty())
		{
			reverse_stack.add(st.peek());
			System.out.print(st.peek()+" ");
			st.pop();
		}
        
		System.out.println("\n\nCloned Version of Stack: ");
		System.out.println(cloned_stack);
		
		System.out.println("\n\nReversed Version of Stack: ");
		System.out.println(reverse_stack);
	}

}
