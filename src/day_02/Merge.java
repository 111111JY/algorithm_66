package day_02;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */
public class Merge {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode MergeHead = null;
        if (list1.val < list2.val) {
            MergeHead = list1;
            MergeHead.next = Merge(list1.next, list2);//递归
        } else {
            MergeHead = list2;
            MergeHead.next = Merge(list1, list2.next);
        }
        return MergeHead;
    }
}
