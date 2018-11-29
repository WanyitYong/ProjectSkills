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
	
	public void display() 
	{}

	public void removeAll() 
	{}

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
	
	public Object get(int index) throws ListException
	{  
		  Node temp = find(index);
		  
		  return temp.getItem();
	}	

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
	{
		if(index == 0)
		{
			head = head.getNext();
			numItems--;
		}
		else
		{
			Node prev = null;
			Node curr = head;
			
			for(int i = 0; i < index; i++)
			{
				prev = curr;
				curr = curr.getNext();
			}
			prev.setNext(curr.getNext());
			numItems--;
		}
	} // end remove
} // end ListReferenceBased