package recursive;

public class TestFebonacci {

	public static void main(String[] args) {
		//斐波那契数列：1 1 2 3 5 8 13
		int i = febonacci(7);
		System.out.println(i);
	}
	
	//打印第n项斐波那契数列  递归的方式  可以使用动态规划的方式用空间换时间
	public static int febonacci(int i) {
		if(i==1 || i==2) {
			return 1;
		}else {
			return febonacci(i-1)+febonacci(i-2);
		}
	}

}
