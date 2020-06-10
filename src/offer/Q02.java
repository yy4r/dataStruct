package offer;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/10 13:51
 */
//��һ�� n * m �Ķ�ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
//
public class Q02 {
    public static void main(String[] args) {
        Q02 q02 = new Q02();
        int [][] test = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        boolean numberIn2DArray = q02.findNumberIn2DArray(test, 13);
        System.out.println(numberIn2DArray);
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //ע��  ��Ҫ�ж�һ��
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        //����˫ָ��
        int i = 0;
        int j = (matrix[0].length) - 1;
        while (matrix[i][j] != target) {
            if (target > matrix[i][j]) {
                //����
                i++;
                if (i>=matrix.length){
                    return false;
                }
            }else {
                j--;
                if (j<0){
                    return false;
                }
            }

        }
        return true;
    }
}
