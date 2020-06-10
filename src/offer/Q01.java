package offer;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 13:43
 */
//找出数组中重复的数字。
//
//
//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
public class Q01 {
    public static void main(String[] args) {
        Q01 q01 = new Q01();
        int[] test = new int[]{1, 2, 3, 1, 5};
        int repeatNumber = q01.findRepeatNumber(test);
        System.out.println(repeatNumber);
    }

    public int findRepeatNumber(int[] nums) {
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (tmp[nums[i]] > 0) {
                return nums[i];
            }
            tmp[nums[i]]++;
        }
        return -1;
    }
}
