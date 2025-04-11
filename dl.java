
import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DetectLoop {
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            }
            nodesSeen.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next.next = node4;
        node4.next = head.next; // creating a loop at position 2

        System.out.println("Has cycle: " + hasCycle(head));
    }
}
