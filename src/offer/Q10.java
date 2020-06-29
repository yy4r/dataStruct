package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/11 11:10
 */
public class Q10 {


    //�����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
    // ·�����ԴӾ����е�����һ��ʼ��ÿһ�������ھ����������ҡ��ϡ����ƶ�һ��
    // ���һ��·�������˾����ĳһ����ô��·�������ٴν���ø��ӡ�
    // ���磬�������3��4�ľ����а���һ���ַ�����bfce����·����·���е���ĸ�üӴֱ������
    //[["a","b","c","e"],
    //["s","f","c","s"],
    //["a","d","e","e"]]
    //
    //�������в������ַ�����abfb����·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���������ӡ�
    //�����е�·��
    static List<List<Character>> lists = new ArrayList();
    static List<Character> list = new ArrayList();
    char tmp = ' ';

    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        return true;
    }

    public void dfs(char[][] board, int i, int j) {
        //��ǰ���Ϊ����
        if (i >= 0 && i < board.length && j >= 0 && j < board[0].length) {
            if (board[i][j] == '/') {
                return;
            }
            tmp = board[i][j];
            list.add(tmp);
        } else {

            lists.add(list);
            return;
        }
        board[i][j] = '/';
        //��������ȫ������һ��
        dfs(board, i + 1, j);

        dfs(board, i - 1, j);

        dfs(board, i, j + 1);

        dfs(board, i, j - 1);
        board[i][j] = tmp;
    }

    public static void main(String[] args) {
        //[["a","b","c","e"],
        //["s","f","c","s"],
        //["a","d","e","e"]]
//        char [][] test = new char[][]{{'a','b','c','d'},{'s','f','c','s'},{'a','d','e','e'}};
        char[][] test = new char[][]{{'a', 'b'}, {'c', 'd'}};
        Q10 q10 = new Q10();
        q10.dfs(test, 0, 0);
        System.out.println(lists.toString());
    }

}
