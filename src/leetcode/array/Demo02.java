package leetcode.array;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/5/20 16:47
 */
//传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。
//
//传送带上的第 i?个包裹的重量为?weights[i]。每一天，我们都会按给出重量的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。
//
//返回能在 D 天内将传送带上的所有包裹送达的船的最低运载能力。

public class Demo02 {
    public static void main(String[] args) {

    }
    public int shipWithinDays(int[] weights, int D) {
        int count = 1;
        int mindate = 1;

        while (mindate==D){
             count++;
             mindate = mindate(weights, count);
        }
        return count;
    }
    /**
     * D如果是最高载重的话  下方逻辑成立
     * @param weights
     * @param
     * @return
     */
    public int mindate(int[] weights, int max_weight) {
        int count = 1;
        int weight = weights[0];
        //贪心
        for (int i = 1; i < weights.length; i++) {
            weight = weight+weights[i];
            if (weight>max_weight){
                i--;
                weight=0;
                count++;
            }
        }

        return count;
    }
}
