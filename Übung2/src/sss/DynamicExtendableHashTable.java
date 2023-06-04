package sss;
import java.lang.reflect.Array;

public class DynamicExtendableHashTable<E> {
	private Class<E> typeOfElement;
	private int capacity;
	private DynamicList<E>[] hashTable;
	
	@SuppressWarnings("unchecked")
	public DynamicExtendableHashTable(Class<E> typeOfElement, int capacity)
	{
		this.typeOfElement = typeOfElement;
		this.capacity = capacity;
		hashTable = (DynamicList<E>[]) Array.newInstance(DynamicList.class, this.capacity);
	}
	
	public DynamicExtendableHashTable(Class<E> typeOfElement)
	{
		this(typeOfElement, 100);
	}
	
	public void add(int key, E e)
	{
		if(hashTable[hashFunction(key)] == null) {
			
			hashTable[hashFunction(key)] = new DynamicList<E>();
		}
		
		hashTable[hashFunction(key)].add(e);
	}
	
	public DynamicArray<E> get(int key)
	{
		DynamicArray<E> array = new DynamicArray<E>(typeOfElement);
		
		hashTable[hashFunction(key)].iteratorInit();
		
		while(hashTable[hashFunction(key)].hasNext()) {
			array.add(hashTable[hashFunction(key)].next());
		}
		
		return array;
	}
	
	private int hashFunction(int key)
	{
		return key % capacity;
	}
}

