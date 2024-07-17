package anurag.blind75.linked_list;


public class _3_merge_two_sorted_list {
    public static void main(String... args){
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4,null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4,null)));

        ListNode result = mergeTwoLists(list1, list2);
        System.out.println("sorted : "+result);
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode sample= new ListNode(1);
        ListNode merge=sample;
        while(list1 !=null && list2 !=null){
            if(list1.val <=list2.val){
                merge.next = list1;
                list1=list1.next;
            }else{
                merge.next=list2;
                list2=list2.next;
            }

            merge = merge.next;
        }

        if(merge.next==list1 && list1 == null){
            merge.next=list2;
        }else{
            merge.next=list1;
        }

        return sample.next;
    }
}
