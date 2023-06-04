package sss;
import java.lang.reflect.Array;

public class DynamicArray<E> {
	Class<E>   typeOfElement;
	private E array[];
	private int count;
	private int capacity;
	private int iterator;
	
	public DynamicArray(Class<E> typeOfElement)
	{
		this(typeOfElement, 10);
	}
	
	@SuppressWarnings("unchecked")
	public DynamicArray(Class<E> typeOfElement, int capacity)
	{
		this.typeOfElement = typeOfElement;
		count = 0;
		this.capacity = capacity;
		array = (E[]) Array.newInstance(typeOfElement, this.capacity);
	}
	
	public void iteratorInit()
	{
		iterator = 0;
	}
	
	public boolean hasNext()
	{
		return iterator < count;
	}
	
	public E next()
	{
		E e = array[iterator];
		iterator++;
		return e;
	}
	
	public int count()
	{
		return count;
	}
	
	public E get(int index)
	{
		return array[index];
	}
	
	@SuppressWarnings("unchecked")
	public void add(E e)
	{
		if(count == capacity - 1)
		{
			int newCapacity = capacity * 2;
			E newArray[] = (E[]) Array.newInstance(typeOfElement, this.capacity);
			
			for(int i = 0; i < capacity; i++)
			{
				newArray[i] = array[i];
			}
			
			array = newArray;
			capacity = newCapacity;
		}
		
		array[count] = e;
		count++;
	}
	
	public E remove(E e)
	{
		for(int i = 0; i < count; i++)
		{
			if(e == array[i])
			{
				int j = i + 1;
				for(; j < count; j++)
					array[j - 1] = array[j];
				
				array[j - 1] = null;
				count--;
			}
		}
		return e;
	}
}

