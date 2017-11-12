package zuoye;

public class Car {
	public static void main(String[] args) {
		ComputerWeight[] t=new ComputerWeight[3]; 
		t[0]=new Computer();
		t[1]=new Television();
		t[2]=new WashMachine();
		double total;
		total=t[0].computerWeight()+t[1].computerWeight()+t[2].computerWeight();
		System.out.println("总重量为:"+total);
	}

}
