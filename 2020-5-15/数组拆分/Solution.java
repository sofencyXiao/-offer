package day09;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author sofency
 * @date 2020/5/14 22:36
 * @package IntelliJ IDEA
 * @description
 */
public class Solution {
  
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sum+=nums[i];
            }
        }
        return sum;
    }
}

