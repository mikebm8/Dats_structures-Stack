import java.util.Scanner;
public class ArrayStack implements Stack
{
	private String arr[];
	private int top;
	
	Scanner kb=new Scanner(System.in);
	
	
	public ArrayStack()
	{
		arr=new String[1000];
		top=-1;
	}
	
	public ArrayStack(int capacity)
	{
		arr=new String[capacity];
		top=-1;
	}
	public boolean isEmpty()
	{
		if(top==-1)
		{
		   System.out.println("Stack is empty");
		   return true;	
		}
			
		else
		    {
			System.out.println("Stack not empty");
			return false;
		    }
	}
	
	public void push(String e)
	{
		System.out.println("Enter the array size");
		int n=kb.nextInt();
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
		
		top++;
		e=kb.next();
		arr[top]=e;
		}
	}
	
	public int size()
	{
		top=top+1;
		System.out.println("Stack size= "+top);
		return top;
	}
	
	public void display()
	{
		int i;
		if(top==-1)
		{
			System.out.println("Stack empty. No element to display");
			
		}
		else
		{
			System.out.println("The elements are: ");
			for(i=0;i<=top;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public String peek()
	{
		System.out.println("The top element is:"+arr[top]);
		return arr[top];
		
	}
	public String pop()
	{
		String temp=arr[top];
		arr[top]=null;
		top--;
		System.out.println("The popped element is: "+temp);
		return temp;
	}
}