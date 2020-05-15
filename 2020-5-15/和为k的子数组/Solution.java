package day09;

import java.util.HashMap;

/**
 * @author sofency
 * @date 2020/5/14 22:36
 * @package IntelliJ IDEA
 * @description  解题思路[0,i] 前i项的和为  pre[i]= pre[i-1]+nums[i]
 *
 *                      [j,i]之间的和为k  pre[i]=pre[j]+k 这种方式 则使用枚举一次比较
 *                                          pre[j]= pre[i]-k 及比较前i项中有多少个满足这个公式就有多少个
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(subarraySum(arr,0));
    }
    public static int subarraySum(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();  //pre[j]  pre[i]-k
        int pre = 0;
        for(int i=0;i<nums.length;i++){
            pre += nums[i];
            if(map.containsKey(pre-k)){
                count+=map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1); //存在的加一
        }
        return count;
    }
    //pre[i]=pre[j]+k 这种方式 则使用枚举一次比较  0<j<i
    public static int subarraySum1(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j>=0;j--){//在 j - i的区间里面找等于k的值
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}

