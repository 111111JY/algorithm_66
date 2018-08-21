package day_02;


/**
 * 输入一个链表，反转链表后，输出新链表的表头
 *
 * 也不是很懂
 */
class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}

public class ReverseList {
    public ListNode1 ReverseList(ListNode1 head) {

        if (head == null) {
            return null;
        }
        ListNode1 newHead = null;
        ListNode1 pNode = head;
        ListNode1 pPrev = null;
        while (pNode != null) {
            ListNode1 pNext = pNode.next;
            if (pNext == null) {  //这里应该是到尽头了，所以新头节点就是最后一个节点
                newHead = pNode;
                pNode.next = pPrev;
                pPrev = pNode;
                pNode = pNext;
            }
        }
        return newHead;
    }
}
