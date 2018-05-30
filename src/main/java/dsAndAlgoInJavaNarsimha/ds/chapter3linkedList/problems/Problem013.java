package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;
/**
 * Problem-13: From previous problems we understand that meeting of slowPtr and fastPtr
 * concludes the existence of loop, but how moving slowPtr to beg of linked list
 * while keeping the fastPtr at meeting place, followed by moving both one step
 * at a time make them meet at starting point of cycle?
 * 
 * Solution: This problem is the heart of number theory. 
 * 	In Floyd cycle finding algo, notice that the slowPtr and fastPtr will meet 
 * 	when they are n x L, where L is length of loop. Furthermore, the slowPtr is
 * 	at the midpoint between the fastPtr and beg os sequence, because of the way 
 * 	they move. Therefore, the tortoise is n x L away from beg of seq as well. 
 *  
 *  If we move both one step at a time, from pos of slowPtr and from start of seq,
 *  we know that they will meet as soon as both are in loop, since they are 
 *  n x L, a multiple of  loop length, apart. One of them is already in loop, 
 *  so we just move the other one in single step until it enters the loop,
 *  keeping the other n x L away from it all times.
 * 
 * @author ashi
 *
 */
public class Problem013 {

}
