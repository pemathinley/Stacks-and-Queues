import java.util.*;

class Stack
{
	int top;
	int arr[];
	Stack(int s)
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

class Queue
{
	int front , rear;
	int arr[];
	
	Queue(int s)
	{
		arr = new int[s];
		front = rear = -1;
	}
	
	void enqueue(int d)
	{
		if( rear == arr.length-1 )
		{
			System.out.println("Queue OverFlow");
		}
		else
		{
			arr[++rear]  = d;
			if( front == -1 )
				front++;
		}
	}
	
	int dequeue()
	{
		if( front == -1 )
		{
			System.out.println("Queue UnderFlow");
			return -1;
		}
		else
		{
			int x = arr[front];
			if( front == rear )
				front = rear = -1;
			else
				front++;
			return x;
		}
	}
	
	void displayQueue()
	{
		for(int i=front ; i<=rear ; i++ )
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	boolean isEmpty()
	{
		if( front == -1 )
			return true;
		else
			return false;
	}
}

public class ImplementQuestion 
{
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter size for stack");
		int n = ip.nextInt();
		
		Stack o1 = new Stack(n);
		
		System.out.println("Push elements in stack");
		for(int i=0 ; i<n ; i++)
		{
			int d = ip.nextInt();
			o1.push(d);
		}
		
		o1.push(555);
		
		System.out.println("Stacks Elements are :");
		o1.displayStack();
		
		o1.pop();
		
		System.out.println("Stack elements after pop :");
		o1.displayStack();
		
		System.out.println("Is stack empty??\n" + o1.isEmpty());
		
		
		System.out.println("Enter size for queue");
		int s = ip.nextInt();
		Queue o2 = new Queue(s);
		
		System.out.println("Insert elements in Queue");
		for(int i=0 ; i<s ; i++)
		{
			int d = ip.nextInt();
			o2.enqueue(d);
		}
		
		o2.enqueue(777);
		
		System.out.println("Queue Elements are :");
		o2.displayQueue();
		
		o2.dequeue();
		o2.dequeue();
		
		System.out.println("Queue elements after dequeue :");
		o2.displayQueue();
		
		System.out.println("Is Queue empty??\n" + o2.isEmpty());
		
		ip.close();
	}
}