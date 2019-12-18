public class Stack {
	private Integer[] arrayStack;
	private Integer MAX_SIZE = 5;
	private Integer top;
	
	/**
	 * Create a stack LIFO with finite deep.
	 */
	public Stack() {
		this.arrayStack = new Integer[MAX_SIZE];
		this.top = 0;
	}

	/**
	 * Inserts an element in the stack. If the stack is full, it shows a message
	 * and stops
	 * 
	 * @param element
	 *            Element to be inserted.
	 */
	public void push(Integer element) {
		if (top >= MAX_SIZE) {
			System.out.println("The stack is full");
		} else {
			arrayStack[this.top] = element;
			top ++;
		}
	}
	
	/**
	 * Extracts an element from the stack. If the stack is empty, it shows a
	 * message and returns -1.
	 * 
	 * @return Extracted element.
	 */ 
	public Integer pull() {
		if (top <= 0) {
			System.out.println("The stack is empty");
			return -1;
		}
		top--;
		return arrayStack[top];
	}
	
	/**
	 * Returns the number of elements in the stack.
	 * 
	 * @return Number of elements in the stack.
	 */
	public Integer getSize() {
		return top;
	}

	/**
	 * Extract nElements objects of the stack.
	 * 
	 * @param nElements
	 *            Number of elements to be extracted.
	 * @return Array with the extracted elements.
	 */
	public Integer[] pull(Integer nElements) {
		Integer[] res = new Integer[nElements];

		for (int i = 0; i >= nElements; i++) {
			res[i] = pull();
		}
		return res;
	}

	/**
	 * Copy an stack into a new stack. The new stack has the same elements in
	 * the same order as the old one.
	 * 
	 * @return Duplicated stack.
	 */
	public Stack copyStack() {
		Stack newStack = new Stack();

		for (int i = 0; i < this.getSize(); i++) {
			newStack.push(arrayStack[i]);
		}
		return newStack;
	}
	
	//Metodos para comprobar resultados
	public void printStack() {
		for (int i = 0; i < getSize(); i++) {
			System.out.println("Elemento " + i + "= " + arrayStack[i]);
		}
	}
	
	public static void main(String args[]) {
		
		//ejemplo 1
		Stack stack1 = new Stack();			
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		System.out.println("Pila 1: ");
		stack1.printStack();
		System.out.println();
		
		//ejemplo 2
		Stack stack2 = new Stack();
		stack2.push(12);
		stack2.push(2);
		stack2.push(43);
		stack2.push(95);
		System.out.println("Pila 2: ");
		stack2.printStack();
		Integer v[] = stack2.pull(stack2.getSize());
		stack2.pull();
		stack2.printStack();
		System.out.println();

		//ejemplo 3
		Stack stack3 = new Stack();
		stack3.push(1);
		stack3.push(2);
		stack3.push(3);
		stack3.push(4);
		System.out.println("Pila 3: ");
		stack3.printStack();
		Stack nueva = stack3.copyStack();
		System.out.println();
		System.out.println("Copia de Pila 3: ");
		nueva.printStack();
		System.out.println();
		

		//ejemplo 4 
		Stack stack4 = new Stack();
		stack4.push(1);
		stack4.push(2);
		stack4.push(3);
		stack4.push(4);
		System.out.println("Pila 4: ");
		stack4.printStack();
		System.out.println("Numero de elementos de la pila = " +  stack4.getSize());

    }

}
