import java.util.*;

class Stack1
{
	int top;
	int arr[];
	Stack1(int s)
	{
		top = -1;
		arr = new int[s];
	}
	
	void push(int n)
	{
		if( top == arr.length-1 )
			System.out.println("Stack OverFlow");
		else
		{
			arr[++top] = n;
		}
	}
	
	int pop()
	{
		if( top == -1 )
		{
			System.out.println("Stack UnderFlow");
			return -1;
		}
		else
			return arr[top--];
	}
	
	void displayStack()
	{
		for(int i=0 ; i<=top ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	boolean isEmpty()
	{
		if( top == -1 )
			return true;
		else
			return false;
	}
}

public class QueueWithTwoStacks 
{
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter size for stack");
		int n = ip.nextInt();
		
		Stack1 o1 = new Stack1(n);
		
		System.out.println("Push elements in stack");
		for(int i=0 ; i<n ; i++)
		{
			int d = ip.nextInt();
			o1.push(d);
		}
		
		System.out.println("ELements in stack");
		o1.displayStack();
		
		Stack1 o2 = new Stack1(n);
		for(int i=0 ; i<n ; i++ )
		{
			o2.push(o1.pop());
		}
		
		System.out.println("Elements after stack conversion to queue");
		o2.displayStack();
		
		o2.pop();
		o2.pop();
		
		System.out.println("After some elements are poped");
		o2.displayStack();
		
		System.out.println("Is it empty :\n" + o2.isEmpty());
		
		
		ip.close();
	}
}