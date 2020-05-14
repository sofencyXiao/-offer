package day09;

/**
 * @author sofency
 * @date 2020/5/14 19:13
 * @package IntelliJ IDEA
 * @description  注意异或  0^1  = 1
 *                        1^1  = 0
 *                        0^2  = 2
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum ^= nums[i];
        }
        return sum;
    }
}

