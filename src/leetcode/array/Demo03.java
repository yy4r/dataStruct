package leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 11:22
 */
//����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء�
//
//�������һֵ�������г����������Σ��������� true �����������ÿ��Ԫ�ض�����ͬ���򷵻� false ��
public class Demo03 {
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03();
        boolean b = demo03.containsDuplicate(new int[]{1, 4, 5, 2, 6});
        System.out.println(b);
    }

    //�ж�����������û���ظ���Ԫ��
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
     * ����  ʱ�临�Ӷ� logn
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
     * ��ϣ
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
