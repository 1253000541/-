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
			throw new NumberFormatException("���ָ�ʽ����");
			
		}/*finally {
			//System.out.println("��������Ч�ֶΣ�");
		}*/
		System.out.println("������һ��ʮ��������:");
		num = in.next();
		change();

	}

	public static void change() {
		int n = Integer.parseInt(num,16);
		System.out.println(n);
	}

}
