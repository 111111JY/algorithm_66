import java.util.ArrayList;
import java.util.Stack;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Println {

    /**
     * 法1：用栈先进后出的特性做
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack=new Stack<>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

/**
 * 法2：用递归来做
 * 只有当==null时，返回从这个函数，返回上一个函数时，同时执行add，
 * 这样的话把最后一个值添加，之后一直返回返回，直到第一步！
 */
//    ArrayList<Integer> arrayList=new ArrayList<Integer>();
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        if (listNode!=null){
//            this.printListFromTailToHead(listNode.next);
//            arrayList.add(listNode.val);
//        }
//        return arrayList;
//    }

}
