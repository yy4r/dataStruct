package leetcode.array;

import java.sql.SQLOutput;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/20 15:59
 */    //在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。
//
//返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。形式上，我们希望索引的数字 i 和 j 满足? i < j 且有?(time[i] + time[j]) % 60 == 0。
//示例 1：
//
//输入：[30,20,150,100,40]
//输出：3
//解释：这三对的总持续时间可被 60 整数：
//(time[0] = 30, time[2] = 150): 总持续时间 180
//(time[1] = 20, time[3] = 100): 总持续时间 120
//(time[1] = 20, time[4] = 40): 总持续时间 60
//示例 2：
//
//输入：[60,60,60]
//输出：3
//解释：所有三对的总持续时间都是 120，可以被 60 整数。

public class Demo {
    public static void main(String[] args) {
        int i = new Demo().numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40});
        System.out.println(i);
        System.out.println(50%60);
    }
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        //每一对的可能性 全部输出
        for (int i = 0;i<time.length;i++){
            for (int j=i+1;j<time.length;j++){
                if ((time[i]+time[j])%60==0){
                    count++;
                }
            }
        }
        return count;
    }
}
