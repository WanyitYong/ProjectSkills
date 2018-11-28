// ****************************************************
// Interface for the ADT list
// ****************************************************
public interface ListInterface
{
	// list operations:
	public boolean isEmpty();
	public int size();
	public void add(int index, Object item) throws ListException;
	public void remove(int index) throws ListException;
	public Object get(int index) throws ListException;
	public void removeAll();
} // end ListInterface