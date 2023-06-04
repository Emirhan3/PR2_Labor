package sss;
public class DynamicHashTable {

	private int capacity;
	private Object[] hashTable;
	
	public DynamicHashTable(int capacity)
	{
		this.capacity = capacity;
		hashTable = new Object[capacity];
	}
	
	public DynamicHashTable()
	{
		this(100);
	}
	
	public boolean add(int key, Object o)
	{
		if(hashTable[hashFunction(key)] == null) {
			hashTable[hashFunction(key)] = o;
			return true;
		}
		
		return false;
	}
	
	public Object get(int key)
	{
		return hashTable[hashFunction(key)];
	}
	
	private int hashFunction(int key)
	{
		return key % capacity;
	}
}

