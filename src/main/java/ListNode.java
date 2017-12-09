//   Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(val);
        ListNode node = this;

        while (node.next != null) {
            node = node.next;
            sb.append(node.val);
        }
        return sb.reverse().toString();
    }
}
