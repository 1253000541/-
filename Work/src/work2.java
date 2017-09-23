import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		
		  int m ;/* 行 */
	        int n ;/* 列 */
	        Scanner s=new Scanner(System.in);
	        System.out.println("请输入一个数:");
	        n=s.nextInt();
	        m=s.nextInt();
	        int[][] pos = new int[m][n];/* 位置 */
	 
	        int count = 0;
	        int r = 0, c = 0;/* r:行下标 c:列下标 pos[r][c]对应以上位置 */
	        /* 赋值方向，先向右c++，再向下r++，再向左c--，再向上r-- */
	        final int up = 1;
	        final int down = -1;
	        final int left = 2;
	        final int right = -2;
	        int dir = right;/* 开始方向 */
	        int cir = 1;/* 第几圈赋值 */
	        while (true) {
	            count++;
	            pos[r][c] = count;/* 赋值 */
	            switch (dir) {
	            case right:
	                if (c < n - cir) {/* 当前行右方还有没赋值的 */
	                    c++;
	                } else {
	                    dir = down;
	                    r++;
	                }
	                break;
	            case down:
	                if (r < m - cir) {/* 当前列下方还有没赋值的 */
	                    r++;
	                } else {
	                    dir = left;
	                    c--;
	                }
	                break;
	            case left:
	                if (c > cir - 1) {/* 当前行左边还有没赋值的 */
	                    c--;
	                } else {
	                    dir = up;
	                    r--;
	                }
	                break;
	            case up:
	                if (r > cir) {/* 当前列上边边还有没赋值的 */
	                    r--;
	                } else {
	                    cir++;/* 赋值了一圈 */
	                    dir = right;
	                    c++;
	                }
	                break;
	            }
	            if (count >= m * n) {
	                break;
	            }
	        }
	        /* 输出 */
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (pos[i][j] < 10) {
	                    System.out.print(pos[i][j] + " " + " ");
	                } else {
	                    System.out.print(pos[i][j] + " ");
	                }
	            }
	            System.out.println();
	        }
	    }

	

}
