import java.util.Scanner;

class MyStack
{
	int top , min;
	int arr[];
	MyStack(int s)
	{
		top = -1;
		min = Integer.MAX_VALUE;
		arr = new int[s];
	}
	
	void push(int n)
	{
		if( top == arr.length-1 )
			System.out.println("Stack OverFlow");
		else
		{
			min = min > n ? n : min;
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
	
	int getMinimum()
	{
		return min;
	}
}


public class MinStack 
{
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter size");
		int n = ip.nextInt();
		
		MyStack o = new MyStack(n);
		
		System.out.println("Push elements in stacks");
		for(int i=0 ; i<n ; i++ )
		{
			int d = ip.nextInt();
			o.push(d);
		}
				
		System.out.println("Minimum element in stack is :\n" + o.getMinimum());
		
		ip.close();
	}

}