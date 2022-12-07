import java.util.Arrays;


public class Stack {

	private String[] theStack;
	private final int STACK_SIZE = 3;
	private int top;
	
	public Stack(){
		this.theStack = new String[STACK_SIZE];
		this.top = 0;
	}
	
	public void push(String s){
		growIfNecessary();
		theStack[top] = s;
		top++;
	}
	
	public String pop(){
		if(top == 0){
			return null;
		}
		top--;
		return theStack[top];
	}
	
	private void growIfNecessary(){
		if(top == theStack.length){
			String[] newStack = new String[2*theStack.length];
			for(int i = 0; i < theStack.length; i++){
				newStack[i] = theStack[i];
			}
			theStack = newStack;
		}
	}
	
	
	public static void main(String[] args) {
		
	        // Default initialization of Stack
	        Stack stack1 = new Stack();
	 
	        // Initialization of Stack
	        // using Generics
	        Stack stack2 = new Stack();
	 
	        // pushing the elements
	        stack1.push("4");
	        stack1.push("3");
	        stack1.push("5");
	        stack1.push("2");
	        stack1.push("6");
	 
	        stack2.push("8");
	        stack2.push("9");
	        
	 
	          // Printing the Stack Elements
	        System.out.println(stack1.pop());
	        System.out.println(stack1.pop());
	        System.out.println(stack1.pop());
	        System.out.println(stack1.pop());
	        System.out.println(stack1.pop());

	        System.out.println("\n");
	        
	        System.out.println(stack2.pop());
	        System.out.println(stack2.pop());
		
	        String value;
	        Stack stack3 = new Stack();
	        while ( stack1 != null ) {
	        	stack3.push(stack1.pop());
	        	if( stack2 != null) {
	        		value = stack2.top;
	        		stack2.pop();
	        		stack3.push(value);
	        	}
	        
	        	System.out.println(stack3.pop());
	 	        System.out.println(stack3.pop());
	 	        System.out.println(stack3.pop());
	 	        System.out.println(stack3.pop());
	 	        System.out.println(stack3.pop());
	        }
	        
	        
		
	}
		

}