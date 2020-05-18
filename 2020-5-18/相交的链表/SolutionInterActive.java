package day09;

/**
 * @author sofency
 * @date 2020/5/18 6:29
 * @package IntelliJ IDEA
 * @description
 */
public class SolutionInterActive {
    //相交链表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l = headA;
        ListNode s =headB;
        int lengthA = NodeLength(headA);
        int lengthB = NodeLength(headB);
        if(lengthA<lengthB){
            l = headB;
            s = headA;
        }
        int len = Math.abs(lengthA-lengthB);
        for(int i=0;i<len;i++){
            l=l.next;
        }
        while (l!=null&&s!=null){
            if(l==s){
                return l;
            }else{
                l=l.next;
                s=s.next;
            }
        }
        return null;//没有交点
    }
    public static int NodeLength(ListNode node){
        int cnt=0;
        while(node!=null){
            cnt++;
            node=node.next;
        }
        return cnt;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
