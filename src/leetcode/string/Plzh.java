package leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 16:38
 */
//中华人民共和国 所有排列组合


public class Plzh {
    public static void main(String[] args) {
        //保存所有的答案
        List<List<String>> answers = new ArrayList<>();
        //保存一个答案
        List<String> oneanswer = new ArrayList<>();
        String s = "中华人民共和国";
        String[] split = s.split("");
      /*  List list = new ArrayList();
        list.add("aa");
        list.add("bb");
        answers.add(list);*/
      /*  System.out.println(list.toString());*/
        new Plzh().myTask(answers, oneanswer, split);
    }

    //我自己做的版本
    public void myTask(List<List<String>> res, List<String> list, String[] nums) {
        //临时的list如果慢了的话 加入到总的
        if (list.size() == nums.length) {
            System.out.println(list.toString());
            res.add(new ArrayList<String>(list));
            return;
        }
        //没有满的话  遍历添加
        for (int i = 0; i < nums.length; i++) {
            //如果包含了的话 换下一个
            if (list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            //后面只需要操作两步
            //1.递归调用
            //list是变化的
            myTask(res, list, nums);
            //2.去掉最近加入的这个元素
            list.remove(list.size()-1);
        }

    }

    public void backTrack(List<List<String>> res, List<String> list, String[] nums) {
        //终结条件，满足条件的时候
        if (list.size() == nums.length) {
            //将满足条件的解加入到解集之中，全局添加一个满足条件的集合
            res.add(new ArrayList<String>(list));
            return;//这个可有可无因为是没有返回值的函数。为了方便理解这里的return是回到else循环里面的backTrack，循环全部结束子函数才会运行结束
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i])) continue;
                //list中不包含nums[i]的时候才添加
                list.add(nums[i]);
                //递归调用，此时的list一直在变化
                backTrack(res, list, nums);
                System.out.println("tempList回溯之后的内容:" + list + "-------" + "i的值:" + i);
                ////它移除tempList最后一个元素的作用就是返回上一次调用时的数据，也就是希望返回之前的节点再去重新搜索满足条件。这样才能实现回溯
                //移除的过程一再在做递归，同样在循环
                list.remove(list.size() - 1);
            }
        }
    }
}
