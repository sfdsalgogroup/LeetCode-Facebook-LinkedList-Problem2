/**
 * 
 */
package leetcode.facebook.problem2.solution;

/**
 * @author Gopal
 *
 */
public class ListCreator {

	private ListCreator() {
		// NOOP
	}

	public static ListNode getPopulatedLinkedList(Integer[] elements) {
		ListNode nextNode = null;
		for (int i = (elements.length - 1); i >= 0; i--) {
			ListNode node = new ListNode(elements[i]);
			node.next = nextNode;
			nextNode = node;
		}
		return nextNode;
	}

}
