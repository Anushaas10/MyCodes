package LinkedList;

public class removeDuplicates {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(3);
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.insertFirst(1);
        ll.display();
//        ListNode node= deleteDuplicates();
    }
    static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        head.next = deleteDuplicates(head.next);

        if (head.val == head.next.val) {
            return head.next;
        } else {
            return head;
        }
    }
}
class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
        val = x;
        next = null;
    }
}
