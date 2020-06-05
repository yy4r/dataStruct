package leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 11:22
 */
//给定一个整数数组，判断是否存在重复元素。
//
//如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
public class Demo03 {
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        boolean b = demo03.containsDuplicate(new int[]{1, 4, 5, 2, 6});
        System.out.println(b);
    }

    //判断数组里面有没有重复的元素
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                    if (nums[i]==nums[j]){
                        return true;
                    }
            }
        }
        return false;
    }

    /**
     * 排序  时间复杂度 logn
     * @param nums
     * @return
     */
    public boolean containsDuplicate02(int [] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    /**
     * 哈希
     * @param nums
     * @return
     */
    public boolean containsDuplicate03(int [] nums){
        Set set =  new HashSet();
        for (int num : nums) {
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
