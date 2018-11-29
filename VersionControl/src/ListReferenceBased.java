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
		return head;
		// Locates a specified node in a linked list.
		// Precondition: index is the number of the desired node. Assumes that 1 <= index <= numItems+1 
		// Postcondition: Returns a reference to the desired node.
	}// end find

	public void add(int index, Object item) throws ListException 
	{
		Node curr = head;
		Node prev = new Node(null, null);
		Node newNode = new Node(item);

		if (index == 0) 
		{
			  head = newNode;
			  numItems++;
		} 
		else 
	    {
			  int a = 0;
			  
			  //checks list is not empty && determines point of insertion
			  while (curr != null && a < index) 
			  {
				  if(index > numItems)
				  {
					  throw new ListException("");
				  }
				  else
				  {
					  prev = curr;
					  curr = curr.getNext();
					  a++;
				  }
			  }
			  	
		    newNode.setNext(curr);
			prev.setNext(newNode);
			numItems++;
	    }
	}  // end add

	public void remove(int index) throws ListException
	{} // end remove

	public void display() 
	{}

	public Object get(int index) throws ListException
	{
		return null;
	}

	public void removeAll() 
	{}
} // end ListReferenceBased