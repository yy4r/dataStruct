package leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 16:38
 */
//�л����񹲺͹� �����������


public class Plzh {
    public static void main(String[] args) {
        //�������еĴ�
        List<List<String>> answers = new ArrayList<>();
        //����һ����
        List<String> oneanswer = new ArrayList<>();
        String s = "�л����񹲺͹�";
        String[] split = s.split("");
      /*  List list = new ArrayList();
        list.add("aa");
        list.add("bb");
        answers.add(list);*/
      /*  System.out.println(list.toString());*/
        new Plzh().myTask(answers, oneanswer, split);
    }

    //���Լ����İ汾
    public void myTask(List<List<String>> res, List<String> list, String[] nums) {
        //��ʱ��list������˵Ļ� ���뵽�ܵ�
        if (list.size() == nums.length) {
            System.out.println(list.toString());
            res.add(new ArrayList<String>(list));
            return;
        }
        //û�����Ļ�  �������
        for (int i = 0; i < nums.length; i++) {
            //��������˵Ļ� ����һ��
            if (list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            //����ֻ��Ҫ��������
            //1.�ݹ����
            //list�Ǳ仯��
            myTask(res, list, nums);
            //2.ȥ�������������Ԫ��
            list.remove(list.size()-1);
        }

    }

    public void backTrack(List<List<String>> res, List<String> list, String[] nums) {
        //�ս�����������������ʱ��
        if (list.size() == nums.length) {
            //�����������Ľ���뵽�⼯֮�У�ȫ�����һ�����������ļ���
            res.add(new ArrayList<String>(list));
            return;//������п�����Ϊ��û�з���ֵ�ĺ�����Ϊ�˷�����������return�ǻص�elseѭ�������backTrack��ѭ��ȫ�������Ӻ����Ż����н���
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i])) continue;
                //list�в�����nums[i]��ʱ������
                list.add(nums[i]);
                //�ݹ���ã���ʱ��listһֱ�ڱ仯
                backTrack(res, list, nums);
                System.out.println("tempList����֮�������:" + list + "-------" + "i��ֵ:" + i);
                ////���Ƴ�tempList���һ��Ԫ�ص����þ��Ƿ�����һ�ε���ʱ�����ݣ�Ҳ����ϣ������֮ǰ�Ľڵ���ȥ��������������������������ʵ�ֻ���
                //�Ƴ��Ĺ���һ�������ݹ飬ͬ����ѭ��
                list.remove(list.size() - 1);
            }
        }
    }
}
