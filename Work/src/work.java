
import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个数:");
		n=s.nextInt();
		Mul(n);
		
	}

	private static void Mul(int n) {
		System.out.println(n);
        if (n <5000) {
            Mul(n*2);
            System.out.println(n);
        }
    
	}

	
}
