/**
 * 
 */
package leetcode.facebook.problem2.solution;

/**
 * @author Gopal
 *
 */
public class ListPrinter {

	private ListPrinter() {
		// NOOP
	}

	public static void printLinkedList(ListNode head) {
		if (head == null) {
			return;
		}
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " --> ");
			temp = temp.next;
		}
		System.out.print(" NULL ");
		System.out.println();
	}

}
