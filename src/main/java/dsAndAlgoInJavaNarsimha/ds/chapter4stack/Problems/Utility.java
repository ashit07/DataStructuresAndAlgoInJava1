package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;

import java.util.Stack;

public class Utility {

	public static void displayStackElems(Stack stack) {
		Stack copyStack = new Stack();
		copyStack.addAll(stack);
		System.out.print("[ "+copyStack.pop());
		while(!copyStack.isEmpty()) {
			System.out.print(", "+copyStack.pop());
		}
		System.out.print(" ]");
		System.out.println("");
	}
}
