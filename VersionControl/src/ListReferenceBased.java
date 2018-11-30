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
	
	public Object get(int index) throws ListException
	{  
		  Node temp = find(index);
		  
		  return temp.getItem();
	}	

	public void add(int index, Object item) throws ListException 
	{
		 if(index > numItems) {
			  
			  throw new ListException("");
		  }
		  
		  if(numItems == 0) {
			  
			  Node first = new Node(item);
			  head = first;
			  numItems++;
		  }
		  else if(index == 0 && numItems > 0) {
			  
			  Node first = new Node(item);
			  first.setNext(head);
			  head = first;
			  numItems++;
		  }
		  else if(index > 0 && index < numItems) {
			  
			  Node nxt = new Node(item);
			  Node curr = head;
			  Node prev = null;
			  
			  for(int i = 0; i < index; i++) {
				  
				  prev = curr;
				  curr = curr.getNext();
			  }
			  
			  nxt.setNext(curr);
			  prev.setNext(nxt);
			  numItems++;
		  }
		  else {
			  
			  Node nxt = new Node(item);
			  Node curr = head;
			  Node prev = null;
			  
			  while(curr != null) {
				  
				  prev = curr;
				  curr = curr.getNext();
			  }
			  
			  prev.setNext(nxt);
			  numItems++;
		  }
	}  // end add

	public void remove(int index) throws ListException
	{
		  if(index == 0) {
			  head = head.getNext();
			  numItems--;
		  }
		  else {
			  
			  Node curr = head;
			  Node prev = null;
			  
			  for(int i = 0; i < index; i++) {
				  
				  prev = curr;
				  curr = curr.getNext();
			  }
			  
			  prev.setNext(curr.getNext());
			  numItems--;
		  }
	} // end remove

	public String display() 
	{
		Node curr = head;
		String single = "";
		  
		  while(curr != null) {
			  
			  single = curr.getItem().toString() + ", ";
			  curr = curr.getNext();
		  }
		  
		return single;
	}

	public void removeAll() 
	{
		head = null;
		numItems = 0;
	}
} // end ListReferenceBased