// ****************************************************
// Reference-based implementation of ADT list.
// ****************************************************
public class ListReferenceBased implements ListInterface 
{
	private Node head; // reference to linked list of items
	private int numItems; // number of items in list

	public ListReferenceBased() 
	{
		head = null;
		numItems = 0;
	}// end default constructor

	public boolean isEmpty() 
	{
		if (numItems == 0)
			return true;
		else
			return false;		
	}// end isEmptys
	
	public int size() 
	{
		return numItems;
	}// end size

	public Node find(int index)
	{
		  Node curr = head;
		  
		  for(int i = 0; i < index; i++) {
			  
			  curr = curr.getNext();
		  }
		  
		  return curr;
	}// end find

	public void add(int index, Object item) throws ListException 
	{}  // end add

	public void remove(int index) throws ListException
	{} // end remove

	public void display() 
	{}

	public Object get(int index) throws ListException
	{  
		  Node temp = find(index);
		  
		  return temp.getItem();
	}

	public void removeAll() 
	{}
} // end ListReferenceBased