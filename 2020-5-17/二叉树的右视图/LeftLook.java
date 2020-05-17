package day09;

import java.util.*;
/**
 * @author sofency
 * @date 2020/5/18 0:08
 * @package IntelliJ IDEA
 * @description 右视图  广度优先遍历采用的是队列的形式每遍历一个节点 先将节点的右孩子加入到队列中  首先获取队列的初始容量 并用for循环先将之前对列中存储的节点输出完。
 */
public class LeftLook {
    private List<Integer> list = new ArrayList<>();
    private Queue<TreeNode> queue = new LinkedList<>();
    public List<Integer> rightSideView(TreeNode root) {
        queue.offer(root);//将根节点加入到队列中
        while(queue.size()!=0){
            int len = queue.size();
            for(int i =0 ;i<len;i++){//队列先进先出
                TreeNode node = queue.poll();
                if(i==0){
                    list.add(node.val);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
            }
        }
        return list;
    }
}
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}  //广度优先遍历
