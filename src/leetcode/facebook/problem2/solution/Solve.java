/**
 * 
 */
package leetcode.facebook.problem2.solution;

/**
 * @author Gopal
 *
 */
public class Solve {

	private Solve() {
		// NOOP
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode result = new ListNode(0);
		ListNode prevNode = result;

		int currentData = 0;
		int carryForward = 0;
		ListNode tempL1 = l1;
		ListNode tempL2 = l2;
		while (tempL1 != null || tempL2 != null) {
			int l1Data = tempL1 != null ? tempL1.val : 0;
			int l2Data = tempL2 != null ? tempL2.val : 0;
			int sum = carryForward + l1Data + l2Data;
			carryForward = sum >= 10 ? 1 : 0;
			currentData = sum % 10;
			ListNode currentResultNode = new ListNode(currentData);
			prevNode.next = currentResultNode;
			prevNode = currentResultNode;
			tempL1 = tempL1 != null ? tempL1.next : null;
			tempL2 = tempL2 != null ? tempL2.next : null;
		}

		if (carryForward == 1) {
			ListNode extraNode = new ListNode(1);
			prevNode.next = extraNode;
		}

		return result.next;
	}

}
