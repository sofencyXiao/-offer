package day09;

/**
 * @author sofency
 * @date 2020/5/18 6:29
 * @package IntelliJ IDEA
 * @description
 */
public class Solution1 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        ListNode listNode = reverseList(node1);

    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode cur = head;
        ListNode next = null;

        while (cur!=null){
            next = cur.next;
            cur.next = prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
