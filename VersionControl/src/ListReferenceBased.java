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
	
	public String[] display() 
	{
		String[] array = new String[numItems];
		String next = "";
		int i = 0;
		for(Node curr = head; curr != null; curr = curr.getNext(), i++)
		{
			System.out.print(curr.getItem() + " ");
			next = curr.getItem().toString();
			array[i] = next;	
		}	
		System.out.println();
		return array;
	}

	public void removeAll() 
	{
		head = null;
		numItems = 0;
	}

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
		  Node now = head;
		  
		  for(int i = 0; i < index; i++)
		  {			  
			  now = now.getNext();
		  }
		  
		  return now;
	}
	
	public Object get(int index) throws ListException
	{  
		Node temp = find(index);
		return temp.getItem();
	}	

	public void add(int index, Object item) throws ListException 
	{
		Node prev = null;
		Node newNode = new Node(item);

		if (index == 0) 
		{
			  head = newNode;
			  numItems++;
		} 
		else 
	    {
			//checks list is not empty && determines point of insertion
			Node curr = head;
			while(curr != null)
			{
				prev = curr;
				curr = curr.getNext();
			}
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
			Node curr = head;
			Node prev = null;
			 
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