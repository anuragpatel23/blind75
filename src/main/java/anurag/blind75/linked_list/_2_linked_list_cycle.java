package anurag.blind75.linked_list;

import java.util.HashSet;
import java.util.List;

public class _2_linked_list_cycle {
    public static void main(String... args){
        ListNode listNode = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4, new ListNode(2)))));

        boolean result1 = hasCycle1(listNode);
        boolean result2 = hasCycle(listNode);
        System.out.println("has cycle : "+result1);
        System.out.println("has cycle : "+result2);

    }

    private static boolean hasCycle(ListNode head) {
        if(head == null ){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != null || fast != null){
            if(fast == null || fast.next == null){
                return false;
            }

            if(fast == slow){
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

    private static boolean hasCycle1(ListNode head) {
        ListNode curr= head;
        HashSet<ListNode> set = new HashSet<>();

        if(head==null)
            return false;

        while (curr!=null){
            if(set.contains(curr)){
                return true;
            }
            set.add(curr);
        }
        return false;
    }


}
