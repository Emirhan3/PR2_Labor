package sss;
public class DynamicList<E> {
	private class ListElement<E>
	{
		E content;
		ListElement<E> pred;
		ListElement<E> succ;
	}
	private ListElement<E> head;
	private ListElement<E> tail;
	private ListElement<E> iterator;
	
	public DynamicList()
	{
		head = null;
		tail = null;
	}
	
	public void iteratorInit()
	{
		iterator = head;
	}
	
	public boolean hasNext()
	{
		return iterator != null;
	}
	
	public E next()
	{
		E e = iterator.content;
		iterator = iterator.succ;
		return e;
	}
	
	public void add(E element)
	{
		ListElement<E> le = new ListElement<>();
		
		le.content = element;
		le.pred = null;
		le.succ = null;
		
		if(head == null)
		{	
			head = le;
			tail = le;
		}
		else
		{
			le.pred = tail;
			tail.succ = le;
			tail = le;
		}
	}
	
	public E remove(E element)
	{
		ListElement<E> i = head;
		
		do
		{
			if(i.content == element)
			{
				i.pred.succ = i.succ;
				i.succ.pred = i.pred;
				
				break;
			}
			i = i.succ;
		}
		while(i != tail);
		
		return element;
	}
}

