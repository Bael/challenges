public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        final int radix = 10;

        int current = (l1.val + l2.val) % radix;
        int remain = (l1.val + l2.val) / radix;

        ListNode answer = new ListNode(current);
        ListNode node = answer;
        final ListNode empty = new ListNode(0);

        while (l1.next != null || l2.next != null) {

            // advance
            if (l1.next != null) {
                l1 = l1.next;
            } else {
                l1 = empty;
            }

            if (l2.next != null) {
                l2 = l2.next;
            } else {
                l2 = empty;
            }

            // get values
            current = (l1.val + l2.val + remain) % radix;
            remain = (l1.val + l2.val + remain) / radix;

            node.next = new ListNode(current);
            node = node.next;

        }

        while (remain > 0) {
            node.next = new ListNode(remain % 10);
            node = node.next;
            remain = remain / 10;
        }


        return answer;


    }

//

}

