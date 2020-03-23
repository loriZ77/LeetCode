/**
 * LeetCode 206. Reverse Linked List - easy
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList206 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //iteration method
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        else {
//            ListNode prevNode = null;
//            while (head !=null){
//                ListNode nextNode = head.next;
//                head.next = prevNode;
//                prevNode = head;
//                head = nextNode;
//            }
//            return prevNode;
//
//        }
//    }

    //recursive method
    public ListNode reverseList(ListNode head){
        if (head==null || head.next == null ){
            return head;
        }
        else {
            ListNode newHead = reverseList(head.next);
            head.next.next=head;
            head.next=null;
            return newHead;
        }
    }

}