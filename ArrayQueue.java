import java.lang.*;
public class ArrayQueue <T> implements Queue <T>
{
	public T[] arr; 
	protected final int head;
	protected int tail; 
	int size = 10;

	//contructor
	public ArrayQueue()
	{
		head = tail = 0;
		Object[] temp = new Object[size];
		arr = (T[]) temp;
	}

	public boolean empty()
	{
		if (head==tail)
		{
			return true;
		}
		return false; 
	}

	public void growarray()
	{
		
		Object[] temp = new Object[arr.length*2];
		
		System.arraycopy(arr,0,temp,0,arr.length);
		arr = (T[]) temp;
	}

	public T dequeue() 
	{
		if (this.empty())
		{
			return null; 
		}
		T temp = arr[head];
		for(int i =0; i < tail-1; i++)
		{
			arr[i] = arr[i+1];
			
			
		}
		//head = (head+1)%arr.length;
		tail--;
		return temp;
	}

	public void enqueue (T t)
	{
		if (tail+1==arr.length)
		{
			growarray();
		}
		arr[tail++] = t;
		//tail = (tail+1)%arr.length; 
		
	}
}