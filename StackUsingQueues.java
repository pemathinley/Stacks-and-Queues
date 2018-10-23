import java.util.*;

class mystack
{
	java.util.Queue<Integer> q1 = new LinkedList<Integer>();
	java.util.Queue<Integer> q2 = new LinkedList<Integer>();
	
	void insert(int d)
	{
		q1.add(d);
		
		while( !q2.isEmpty() )
			q1.add(q2.remove());
		
		java.util.Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	void display()
	{
		while( !q2.isEmpty() )
		{
			System.out.print( q2.remove() + " ");
		}
		System.out.println();
	}
}

public class StackUsingQueues 
{
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) 
	{
		mystack s = new mystack();
		System.out.println("Enter size");
		int n = ip.nextInt();
		
		System.out.println("Enter element");
		for(int i=0 ; i<n ; i++ )
		{
			int d = ip.nextInt();
			s.insert(d);
		}
		
		System.out.println("Element in stack are :");
		s.display();
		ip.close();
	}

}