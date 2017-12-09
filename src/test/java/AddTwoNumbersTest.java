import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(9);


        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(9);


        assertEquals( String.valueOf(981+983),  new AddTwoNumbers().addTwoNumbers(l1, l2).toString());


    }
}