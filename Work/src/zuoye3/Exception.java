package zuoye3;

import java.util.Scanner;

public class Exception {
	static String num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		try {
			in = new Scanner(System.in);
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			throw new NumberFormatException("数字格式不对");
			
		}/*finally {
			//System.out.println("请输入有效字段！");
		}*/
		System.out.println("请输入一个十六进制数:");
		num = in.next();
		change();

	}

	public static void change() {
		int n = Integer.parseInt(num,16);
		System.out.println(n);
	}

}
