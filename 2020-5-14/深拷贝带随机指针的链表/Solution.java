package day09;

import java.util.HashMap;

/**
 * @author sofency
 * @date 2020/5/14 22:36
 * @package IntelliJ IDEA
 * @description
 */
public class Solution {
    private HashMap<Node,Node> map = new HashMap<>();//Node 是之前的结点  Node 是新建的结点
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node p = head;
        while(p!=null){
            map.put(p,new Node(p.val));
            p=p.next;
        }

        p=head;

        while(p!=null){
            map.get(p).next = map.get(p.next);
            map.get(p).random = map.get(p.random);
            p=p.next;
        }
        return map.get(head);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}