package day09;

/**
 * @author sofency
 * @date 2020/5/18 6:29
 * @package IntelliJ IDEA
 * @description
 */
public class Solution1 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head==null){
            return null;
        }else if(head.val==val){
            return head.next;
        }else{
            ListNode prev = head;
            ListNode next = head.next;
            while(next!=null){
                if(next.val==val){
                    prev.next = next.next;
                    break;
                }else{
                    prev= prev.next;
                    next = next.next;
                }
            }
            return head;
        }
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
