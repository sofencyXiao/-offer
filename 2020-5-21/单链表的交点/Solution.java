//归根揭底的思想就是x+y-n = y+x-n
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;
        while(node1!=null&&node2!=null){
            node1 = node1.next;
            node2 = node2.next;
        }
        if(node2 == null){//说明node1非空
            node2 = headA;
            while(node1!=null&&node2!=null){
                node2 = node2.next;
                node1 = node1.next;
            }
            node1=headB;
            while(node1!=null&&node2!=null){
                if(node2==node1){
                    return node1;
                }
            }
            return null;
        }

         if(node1 == null){//说明node1非空
            node1 = headB;
            while(node1!=null&&node2!=null){
                node2 = node2.next;
                node1 = node1.next;
            }
            node2=headA;
            while(node1!=null&&node2!=null){
                if(node2==node1){
                    return node1;
                }
            }
            return null;
        }
        return null;
    }
}