import java.lang.*;
public class ArrayStack <T> implements Stack <T>
{
	protected T[] arr;
	protected int top;
	protected int size = 10  ;

	//contructor 
	public ArrayStack()
	{
		top = -1;
		Object[] temp = new Object[size];
		arr = (T[]) temp;
	}

	public boolean empty()
	{
		if (top==-1)
		{
			return true; 
		}
		return false; 
	}

	//double the size of array times 2
	public void growarray()
	{
		Object[] temp = new Object[arr.length*2];
		System.arraycopy(arr,0,temp,0,arr.length);
		arr = (T[]) temp;
	}
	
	public T pop() 
	{
		if (empty())
		{
			return null;
		}
		return arr[top--];
	}

	public T peek() 
	{
		if (empty())
		{	
			return null;
		}
		return arr[top];
	}

	public void push (T t)
	{
		if (top==arr.length-1)
		{
			growarray();
		}
		arr[++top] = t; 
	}
}