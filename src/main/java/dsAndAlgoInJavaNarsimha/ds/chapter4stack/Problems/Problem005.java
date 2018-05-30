package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;
/**
 * Problem 5: Can we evaluate the infix expression with stacks in one pass?
 * Solution: Using 2 stacks we can evaluate an infix expression in 1 pass without 
 * converting to postfix.
 * Algorithm:
 * 1) Create an empty operator stack.
 * 2) Create an empty operand stack.
 * 3) For each token in input string.
 * 	  a) Get the next token in infix string.
 *    b) If the next token is operand, put it on operand stack.
 *    c) If next token is operator:
 *    		i) Evaluate the operator (next op).
 * 4) While operator stack is not empty, pop operator and operands (left and right)
 *    evaluate left operator right and push result onto operand stack.
 * 5) Pop result from operand stack.
 * @author ashi
 *
 */
class Problem005 {

}
