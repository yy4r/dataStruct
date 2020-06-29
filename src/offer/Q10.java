package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/11 11:10
 */
public class Q10 {


    //请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
    // 路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
    // 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
    // 例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
    //[["a","b","c","e"],
    //["s","f","c","s"],
    //["a","d","e","e"]]
    //
    //但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
    //放所有的路径
    static List<List<Character>> lists = new ArrayList();
    static List<Character> list = new ArrayList();
    char tmp = ' ';

    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        return true;
    }

    public void dfs(char[][] board, int i, int j) {
        //当前标记为已走
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
        //上下左右全部搜索一遍
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
