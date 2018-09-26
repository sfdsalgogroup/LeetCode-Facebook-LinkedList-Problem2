/**
 * 
 */
package leetcode.facebook.problem2.solution;

/**
 * @author Gopal
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode l1 = ListCreator.getPopulatedLinkedList(new Integer[] { 2, 4, 3 });
		ListNode l2 = ListCreator.getPopulatedLinkedList(new Integer[] { 5, 6, 4 });
		ListPrinter.printLinkedList(l1);
		ListPrinter.printLinkedList(l2);

		ListNode sum = Solve.addTwoNumbers(l1, l2);
		ListPrinter.printLinkedList(sum);

		l1 = ListCreator.getPopulatedLinkedList(new Integer[] { 9, 9, 9 });
		l2 = ListCreator.getPopulatedLinkedList(new Integer[] { 1, 0, 0 });
		ListPrinter.printLinkedList(l1);
		ListPrinter.printLinkedList(l2);

		sum = Solve.addTwoNumbers(l1, l2);
		ListPrinter.printLinkedList(sum);

		l1 = ListCreator.getPopulatedLinkedList(new Integer[] { 5, 5, 5 });
		l2 = ListCreator.getPopulatedLinkedList(new Integer[] { 5 });
		ListPrinter.printLinkedList(l1);
		ListPrinter.printLinkedList(l2);

		sum = Solve.addTwoNumbers(l1, l2);
		ListPrinter.printLinkedList(sum);

		l1 = ListCreator.getPopulatedLinkedList(new Integer[] { 5, 5, 5 });
		l2 = ListCreator.getPopulatedLinkedList(new Integer[] {});
		ListPrinter.printLinkedList(l1);
		ListPrinter.printLinkedList(l2);

		sum = Solve.addTwoNumbers(l1, l2);
		ListPrinter.printLinkedList(sum);
	}

}
