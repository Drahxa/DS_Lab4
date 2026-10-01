import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TestStack {

	public TestStack() {
		
	}

	@Test
	void testItAll() {
		MyStack<String> stack = new MyStack<String>();
		
		assertTrue(stack.isEmpty());
		//
		
		stack.push("A");
		assertEquals("A", stack.top());
		// A is at the top
		
		stack.push("B");
		assertEquals("B", stack.top());
		// B is at the top
		
		
		assertFalse(stack.isEmpty());
		
		assertEquals("B", stack.pop());
		// Removes and returns B
		
		assertEquals("A", stack.top());
		// Checks that B was removed
		
		
		assertEquals("A", stack.pop());
		// Removes and returns A
		
		assertTrue(stack.isEmpty());
		//Checks that the stack is empty
		
		assertThrows(StackUnderFlowException.class,
				()-> {
					stack.top();
				});
		
		assertThrows(StackUnderFlowException.class,
				()-> {
					stack.pop();
				});
		
		
		
		
	}
	
}
