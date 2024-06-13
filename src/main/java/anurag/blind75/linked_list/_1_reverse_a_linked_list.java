package anurag.blind75.linked_list;

public class _1_reverse_a_linked_list {

    public static void main(String... args){
        ListNode head= new ListNode();
        head.val=1;
        head.val=2;
        head.val=3;
        head.val=4;
        head.val=5;
        ListNode result = reverseList(head);

    }
    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while(curr!= null){

            ListNode temp = curr.next;
            curr.next = prev;
            prev= curr;
            curr = temp;
        }

        return prev;

    }
}

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }