
public class MyStack<T>
{
	
	public class Node{
		T val;
		Node next;
		
		Node(T val, Node next){
			this.val = val;
			this.next = next;
		}
	}
	
	Node head;
	
	public MyStack()
	{
		head = null;
		
	}

	/**
	 * Pushes an element to the stack
	 * @param val
	 */
	public void push(T val)
	{
		if(head == null) {
			head = new Node (val, null);
		} else {
			head = new Node (val, head);
		}
	}

	/**
	 * Throws stack underflow exception if empty
	 * @return the top element on the stack
	 */
	public T top()
	{
		if(head.isEmpty()) {
			throw new StackUnderFlowException();
		} else {
			return head.next;
		}
		
		
	}

	/**
	 * Pops the top element of the stack and returns it.
	 * Throws stack underflow exception if empty
	 * @return the popped element from the stack
	 */
	public T pop()
	{
		return head.next;
		head.next = head.next.next;
		
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		if(head.next == null) { return true;}
		return false;
	}

}

